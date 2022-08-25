package list;

import java.util.HashSet;

public class hashset {
	public static void main(String[] args) {
		
		
	
	HashSet<Integer> s=new HashSet<Integer>();
	s.add(10);
	s.add(10);
	s.add(20);
	s.add(300);
	s.add(40);
	s.add(300);
	s.add(50);
System.out.println(s);// will  not allow duplicates
for(int i=1;i<20;i++)
{
	s.add(i);
	
}
s.remove(300);// can't give the index number since it doesn't have an order
System.out.println(s.remove(200));// will give false if the element is not  present
System.out.println(s.size());

System.out.println(s);//
}
}

