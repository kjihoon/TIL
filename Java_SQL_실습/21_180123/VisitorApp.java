package Jdbc;

import java.sql.*;
import java.util.*;
public class VisitorApp {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE","jdbctest5","jdbctest");
		Statement stmt = conn.createStatement();
		String name,memo,date,word;
		Scanner sc = new Scanner(System.in);
		ResultSet rs;
		while(true){
			try{
				System.out.println("1. 방명록 작성\n2. 방명록 리스트 출력\n3. 방명록 검색\n4.종료");
				System.out.println("원하는 기능을 선택하세요: ");
				int func = sc.nextInt();
				if (func==1){
					System.out.println("이름 입력");
					name=sc.next();name="'"+name+"'";
					System.out.println("날짜");
					date=sc.next();date="'"+date+"'";
					System.out.println("메모");
					memo=sc.next();memo="'"+memo+"'";
					stmt.executeUpdate("INSERT INTO VISITOR VALUES"
							+"("+name+","+date+","+memo+")");
					System.out.println("저장 성공");
				}else if (func==2){
					rs = stmt.executeQuery("select * from visitor");
					while(rs.next()){
						System.out.println("------------------\n작성자명(작성날짜)");
						System.out.println(rs.getString
								("name")+"("+rs.getString("writedate")+")");
						System.out.println(rs.getString("memo"));
					}
					System.out.println("------------------");
				}else if (func==3){
					System.out.println("검색어 입력");
					word = sc.next();
					rs = stmt.executeQuery("SELECT * FROM VISITOR WHERE MEMO LIKE '%"+word+"%'");
					
					if (rs.next()){
						do{
							System.out.println("------------------\n작성자명(작성날짜)");
							System.out.println(rs.getString
									("name")+"("+rs.getString("writedate")+")");
							System.out.println(rs.getString("memo"));
						}while(rs.next());
						System.out.println("---------------------");
					}else{
						System.out.println("문자가 없다");
					}
					
			
					
				}else if (func==4){
					System.out.println("프로그램 종료");
					break;
				}else{
					System.out.println("1-4번 중 선택해주세요!");
				}
			}catch(SQLException se){
				System.out.println("저장 실패");
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		
		}
	}
}
