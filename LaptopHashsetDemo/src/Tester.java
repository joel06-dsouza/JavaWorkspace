import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Laptop implements Comparable<Laptop>{
	private int lid;
	String make;
	double cost;

	public Laptop(int lid, String make, double cost) {
		super();
		this.lid = lid;
		this.make = make;
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, lid, make);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && lid == other.lid
				&& Objects.equals(make, other.make);
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", make=" + make + ", cost=" + cost + "]";
	}

	public void show() {
		System.out.println(lid+ " " +make+" " +cost);
	}

	@Override
	public int compareTo(Laptop o) {
		if(this.cost<o.cost) {
			return -1;
		}
		else if(this.cost>o.cost) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public int getLid() {
		return lid;
	}
	
	public double getCost() {
		return cost;
	}

}

class LaptopCompare implements Comparator<Laptop> {

	@Override
	public int compare(Laptop o1, Laptop o2) {
		if(o1.getLid() < o2.getLid()) {
			return -1;
		}
		else if(o1.getLid() > o2.getLid()) {
			return 1;
		}
		else {
			return 0;
		}
	}


}

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Laptop> s = new TreeSet<>();
		s.add(new Laptop(101,"LG",20000));
		s.add(new Laptop(102,"PG",50000));
		s.add(new Laptop(102,"PG",40000));
		s.add(new Laptop(131,"HG",60000));
		System.out.println(s);
		System.out.println();
		
		List<Laptop> l = new ArrayList<Laptop>();
		l.add(new Laptop(101,"LG",20000));
		l.add(new Laptop(102,"PG",50000));
		l.add(new Laptop(102,"PG",40000));
		l.add(new Laptop(131,"HG",60000));
		Collections.sort(l,new LaptopCompare());
		System.out.println(l);
	}

}
