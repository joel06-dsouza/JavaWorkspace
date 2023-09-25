import java.util.Iterator;

import java.util.*;
import java.util.List;
public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<>();

		li.add(90);
		li.add(80);
		li.add(70);
		li.add(60);
		li.add(50);
		System.out.println(li);
		System.out.println();

		for(Integer lial:li)
			System.out.println(lial+" ");

		System.out.println();
		Iterator<Integer> itr = li.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

		System.out.println("\n"+li.get(4) * 5);

	}

}

