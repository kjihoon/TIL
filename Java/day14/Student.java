package day14;
import java.io.*;
public class Student implements Serializable{
	 String name;
	 int age;
	 String project;
	 
	 public Student(){
		 super();
	 }
	 public Student(String name, int age, String project) {
		super();
		this.name = name;
		this.age = age;
		this.project = project;
	}
	public void study(){
		 System.out.println( name+"가"+project+"학습중입니다.");
	 }
}
