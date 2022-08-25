package list;
import java.util.*;
public class vector {
public static void main(String[] args) {
	
	Vector v=new Vector ();// can fix the size of the vector here if needed.
	for(int i=0;i<9;i++) 
	{
		v.add(i);
	//	if(i%2==0)
		{
			System.out.print(i+"  ");
		}
		
	}
	System.out.println();
	v.removeElementAt(1);
	v.removeElementAt(5);
	System.out.println(v);
	System.out.println(v.capacity());//  it will give the default size of vector which is 10. 
	//will increase by another 10 when the first is full
	
	System.out.println(v.size());
	//v.clear();
	System.out.println(v.isEmpty());// if the vector is empty will show true if not then false
	
	v.add(4);
	System.out.println(v);
	v.remove(4);// will remove the element present in the index
	System.out.println(v.indexOf(4));// gives the index number of first occurrence element
	
	
	
	
}
}
