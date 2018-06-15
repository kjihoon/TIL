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
				System.out.println("1. ���� �ۼ�\n2. ���� ����Ʈ ���\n3. ���� �˻�\n4.����");
				System.out.println("���ϴ� ����� �����ϼ���: ");
				int func = sc.nextInt();
				if (func==1){
					System.out.println("�̸� �Է�");
					name=sc.next();name="'"+name+"'";
					System.out.println("��¥");
					date=sc.next();date="'"+date+"'";
					System.out.println("�޸�");
					memo=sc.next();memo="'"+memo+"'";
					stmt.executeUpdate("INSERT INTO VISITOR VALUES"
							+"("+name+","+date+","+memo+")");
					System.out.println("���� ����");
				}else if (func==2){
					rs = stmt.executeQuery("select * from visitor");
					while(rs.next()){
						System.out.println("------------------\n�ۼ��ڸ�(�ۼ���¥)");
						System.out.println(rs.getString
								("name")+"("+rs.getString("writedate")+")");
						System.out.println(rs.getString("memo"));
					}
					System.out.println("------------------");
				}else if (func==3){
					System.out.println("�˻��� �Է�");
					word = sc.next();
					rs = stmt.executeQuery("SELECT * FROM VISITOR WHERE MEMO LIKE '%"+word+"%'");
					
					if (rs.next()){
						do{
							System.out.println("------------------\n�ۼ��ڸ�(�ۼ���¥)");
							System.out.println(rs.getString
									("name")+"("+rs.getString("writedate")+")");
							System.out.println(rs.getString("memo"));
						}while(rs.next());
						System.out.println("---------------------");
					}else{
						System.out.println("���ڰ� ����");
					}
					
			
					
				}else if (func==4){
					System.out.println("���α׷� ����");
					break;
				}else{
					System.out.println("1-4�� �� �������ּ���!");
				}
			}catch(SQLException se){
				System.out.println("���� ����");
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		
		}
	}
}
