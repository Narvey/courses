import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CourseList {
	private Map<String, String> courses;

	public CourseList() {
		courses = new HashMap<String, String>();
	}
	public void addCourse(String name, String course)
	{
		courses.put(name, course);
	}
	public void printCourses(){
		//TODO
	}
	public static void main(String[] args){
		CourseList all = new CourseList();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a student's name (or Q to quit), hit enter, then enter their favorite course.");
		String name=" ";
		String course=" ";
		while(true){
			name = scan.nextLine();
			if(name=="Q")break;
			course = scan.nextLine();
			all.addCourse(name, course);
		}

		//TODO fill with loop and other requirements
	}
}
