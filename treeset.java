package list;

import java.util.TreeSet;

public class treeset {
public static void main(String[] args) {
//	TreeSet<String> t= new TreeSet<String>();
//	t.add("name1");
//	t.add("name2");
//	t.add("name3");
//	t.add("name4");
//	t.add("name5");
//	t.add("name6");
//	System.out.println(t);
//	t.add("name4");// will not print duplicate
//	t.add("name7");
//	System.out.println(t);
//	
//	/*System.out.println(t.ceiling("name1")); // prints the element given
//	System.out.println(t.floor("name3"));*/
//	
//	System.out.println(t.first());// gives the first element
//	System.out.println(t.last());// last element
	
	TreeSet<Integer> t1= new TreeSet<Integer>();
	t1.add(10);
	t1.add(20);
	t1.add(30);
	t1.add(40);
	t1.add(50);
	t1.add(60);
	t1.add(70);
	System.out.println(t1.ceiling(28));// gives the higher value than the number said
	System.out.println(t1.floor(56));// gives the lower value than the number said
	System.out.println(t1.descendingSet());// gives the values in descending order
	
	System.out.println(t1.headSet(40, false));// gives the elements before the said element
	
}

}
