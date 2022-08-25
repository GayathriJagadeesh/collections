package list;
import java.util.*;
class student{
	String name;
	int age;
	public student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+ " "+ age;
	}
}
public class student1 {
	public static void main(String[] args) {
		ArrayList<student>s=new ArrayList<student>();
		student s1=new student("student1", 21);
		student s2=new student("student2", 22);
		student s3=new student("student3", 23);
		student s4=new student("student4", 24);
		student s5=new student("student5", 25);
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		
		Iterator<student>itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
