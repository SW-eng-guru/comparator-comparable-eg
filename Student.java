
public class Student implements Comparable<Student>{

	private String id, name;
	private float gpa;
	
	public Student(String id, String name, float gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public int compareTo(Student o) {
		// by id -- biz logic. 
		return id.compareTo(o.id);
	}

	@Override
	public String toString() {
		return "Student[id=" + id + ", name=" + name + ", gpa=" + gpa + "]";
	}

	
	
	
}
