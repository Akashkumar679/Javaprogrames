package alllistprograme;

import java.util.ArrayList;
import java.util.Iterator;

public class list {

	public static void main(String[] args) {
     ArrayList<Integer> a1=new ArrayList<Integer>();
     a1.add(19);
     a1.add(21);
     a1.add(66);
     a1.add(20);
     a1.add(21);
     a1.add(60);
     Iterator<Integer> itr=a1.iterator();
     while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}
     
	}

}
