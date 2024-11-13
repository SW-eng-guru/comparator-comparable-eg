import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class App {
	/* Student-s -- ordered by id-s mainly (biz logic)
	 * also by other fields. 	 */
	public static void main(String[] args) {
		List<Student> all = new LinkedList<>();
		all.add(new Student("001", "Alice", 3.12f));
		all.add(new Student("112", "Bob", 3.98f));
		all.add(new Student("049", "Chuck", 2.22f));
		all.add(new Student("012", "Dave", 3.00f));
		
		Collections.sort(all);
		System.out.println("sorted -- by natural order: "+all);
		
		for (StudentComparator sc:StudentComparator.values()) {
			Collections.sort(all, sc.comparator());
			System.out.println("\nsorted -- by "+sc.name()+": "+all);
		}
	}
	
}

enum StudentComparator {
	NAME, GPA;
	
	Comparator<Student> comparator(){
		switch (this) {
		case NAME: return new Comparator<>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		case GPA: return new Comparator<>() {
			@Override
			public int compare(Student o1, Student o2) {
				return Float.compare(o1.getGpa(), o2.getGpa());
			}
		};
		default: throw new IllegalStateException("No such attribute/state, never supposed to happen");

		}
	}
	
	
}
