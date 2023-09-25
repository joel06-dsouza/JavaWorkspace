import java.util.*;
class UtilityReport implements Comparable<UtilityReport>{
	private Map<String, Double> m;


	public UtilityReport() {
		m = new HashMap<>();
	}



	public void showReport(UtilityList ul) {
		System.out.println("Percentage Report");
		for(Student s: ul.getL()) {
			m.put(s.getName(), s.getPercent());
		}
		for(Map.Entry<String, Double> e: m.entrySet()) {
			System.out.println(e.getKey()+"  ----> "+ e.getValue());
		}


	}


	@Override
	public int compareTo(UtilityReport o) {
		//		if() {
		//			return 1
		//		}
		//		else if()  {
		//			return -1;
		//		}
		//		else {			
		return 0;
		//		}
	}


}

class UtilityList {
	private List<Student> l;

	public UtilityList() {		
		l=new ArrayList<>();
	}

	public List<Student> getL() {
		return l;
	}


	public void setL(List<Student> l) {
		this.l = l;
	}


	public void createList() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Roll Number - ");
		int rollno = sc.nextInt();

		System.out.print("Enter Student Name - ");
		String name = sc.next();

		System.out.print("Enter Student Percentage - ");
		double percent = sc.nextDouble();

		System.out.print("Enter Total Skillset - ");
		int total = sc.nextInt();
		System.out.print("Enter Student SkillSet - ");
		Set<String> skillset = new HashSet<>();
		for(int i=0; i<total; i++) {
			String sk = sc.next();
			skillset.add(sk);
		}

		Student s = new Student(rollno, name, percent, skillset);

		l.add(s);
	}

	public void printList() {
		for(Student s: l) {
			System.out.println("Roll No. - "+s.getRollno());
			System.out.println("Name. - "+s.getName());
			System.out.println("Percentage. - "+s.getPercent());
			System.out.println("Skill Set. - "+s.getSkillset());
			System.out.println();
		}
	}
}

class Student {
	private int rollno;
	private String name;
	private double percent;
	private Set<String> skillset;

	public Student() {
		rollno=101;
		name="Joel";
		percent=73;
		skillset=new HashSet<>();
	}

	public Student(int rollno, String name, double percent, Set<String> skillset) {
		this.rollno = rollno;
		this.name = name;
		this.percent = percent;
		this.skillset = skillset;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public Set<String> getSkillset() {
		return skillset;
	}

	public void setSkillset(Set<String> skillset) {
		this.skillset = skillset;
	}

}


public class Tester {

	public static void main(String[] args) {
		UtilityList u = new UtilityList();
		u.createList();
		u.printList();
		System.out.println();
		UtilityList u1 = new UtilityList();
		u1.createList();
		u1.printList();
		System.out.println();
		UtilityList u2 = new UtilityList();
		u2.createList();
		u2.printList();
		System.out.println();
		UtilityReport ur = new UtilityReport();
		ur.showReport(u);
		ur.showReport(u1);
		ur.showReport(u2);
	}

}












