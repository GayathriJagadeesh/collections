package list;
import java.util.*;
public class Arraylist_methods {
	public static void main(String[] args) {
	ArrayList<String> alist=new ArrayList<String>();
		alist.add("will");
		alist.add("add");
		alist.add("everything");
		alist.add("from");
		alist.add("alist1");
		alist.add("to");
		alist.add("alist");
		ArrayList<String> alist1=new ArrayList<String>();
		alist1.add("including");
		alist1.add("from");
		alist1.add("alist");
		//ADD METHOD
	//addAll(alist1);
		//System.out.println(alist);
		
        // TO ADD FROM PARTICULAR INDEX IN ALIST
		//alist.addAll(2, alist1); 
		//System.out.println(alist);
		
        // CLEAR METHOD
		//alist.clear();
		//System.out.println(alist);// clears everything from alist
		
		//CLONE METHOD
		//alist.clone();
		//System.out.println(alist);//
                            // OR//
		//ArrayList<String> cloneList= (ArrayList<String>)alist.clone();
		//System.out.println(cloneList);
	
		//CONTAINS says if the string is present or not, if present then true if not then false, like a boolean function
		//System.out.println(alist.contains("falls"));
	//	System.out.println(alist.containsAll(alist1));// if it contains all names from alist1 in alist then true
		
		//INDEX
		//System.out.println(alist.indexOf("from"));
		//System.out.println(alist.indexOf("from")>4);// says even if it true or false when the required condition is given
	
		//LAST INDEX
		//ArrayList<String> alist3=new ArrayList<String>(Arrays.asList("Lisa", "Steve", "Dave", "Lisa", "Sam"));
		//int i=alist3.lastIndexOf("Lisa");
		//System.out.println(i);
		//int i=alist3.lastIndexOf("hema"); // will print -1 if the name is not on the list
		//System.out.println(i);
		
		//REMOVE
		//alist3.remove(0);// can remove with index
		//System.out.println(alist3);
		//alist3.remove("Dave");// can also remove with name
		//System.out.println(alist3);
		
		//REMOVE IF used for integers 
		//ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		//numbers.removeIf(num -> num%2==0);
		//System.out.println(numbers);
		
		//RETAIN ALL
		//System.out.println(alist3);
		//alist1.retainAll(Collections.singleton("from")); // to collect a specific name from the list
		//System.out.println(alist1);
		//alist.retainAll(alist); 
		//System.out.println(alist);
		
		//SUBLIST
		//ArrayList<Integer> numbers1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		//ArrayList<Integer> sublist=new ArrayList<Integer>(numbers1.subList(2, 7));// will exclude the last index
		//System.out.println(sublist);
		 
		//ENSURE CAPACITY
		//numbers1.ensureCapacity(15);
		//System.out.println(numbers1);
	
		//EQUALS
		//if(alist.equals(alist1)==true) {
	//	System.out.println("true");
	//}
	//	else {
	//		System.out.println("false");
	//	}
        
		//FOR EACH
	     //alist.forEach((n)-> print(n));
	     
		
		
		
		
		
		
		
		
	}}
