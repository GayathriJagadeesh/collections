package list;
import java.util.*;
public class stack {
public static void main(String[] args) {

	Stack<Integer>st=new Stack<Integer>();
	st.push(1);
	st.push(2);
	st.push(3);
	st.push(5);
	st.push(6);
	st.push(7);
	st.push(8);
	st.push(9);
	System.out.println(st);//	[1, 2, 3, 5, 6, 7, 8, 9]
	
	System.out.println(st.size());// 8
	
   //	st.pop();
	//System.out.println(st);//[1, 2, 3] 
	System.out.println(st.pop());//9
	
	System.out.println(st);// [1, 2, 3, 5, 6, 7, 8]
	
	System.out.println(st.peek());// gives the last element without taking it out //8
	System.out.println(st);
	
	//System.out.println(st.search(3)); //gives the index number
	//System.out.println(st.search(6)); 
	//System.out.println(st.search(10));// if the elements are not in stack it will give -value/ -1
}

}
