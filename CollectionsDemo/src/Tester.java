import java.util.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();			//Dynamically  growing Array duplicate elements supported.
		
		v.add(90);
		v.add(80);
		v.add(70);
		v.add(60);
		v.add(50);
		System.out.println(v);
		System.out.println();
		
		for(Integer val:v)
			System.out.println(val+" ");
		
		System.out.println();
		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\n"+v.get(4) * 5);
		
	}

}
