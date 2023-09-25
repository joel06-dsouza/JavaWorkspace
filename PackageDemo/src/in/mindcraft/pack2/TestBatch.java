package in.mindcraft.pack2;

public class TestBatch {
	private String course_name;
	private int batch_strength;
	
	public TestBatch() {
		course_name="Java";
		batch_strength=16;
	}
	
	public TestBatch(String course_name, int batch_strength) {
		this.course_name=course_name;
		this.batch_strength=batch_strength;
	}
	
	public void show() {
		System.out.println("Course Name: "+course_name);
		System.out.println("Batch Strength: "+batch_strength);
	}

}
