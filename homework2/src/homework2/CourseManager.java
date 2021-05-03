package homework2;

public class CourseManager {

	public void addCourse(Course course) {
		System.out.println("Kurs Adı : "+course.courseName +" basariyla eklendi\n");
	}
	public void deleteCourse(Course course) {
		System.out.println(course.courseName+" adlı Kurs Sepetten Çıkarılmıştır\n");
	}
}
