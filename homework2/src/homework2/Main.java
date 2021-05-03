package homework2;

public class Main {

	public static void main(String[] args) {

		Course course1=new Course(1,"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)","Engin");
		Course course2=new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)","Engin");

		
		Course[]course= {course1,course2};
		System.out.println("Mevcut Kurs Sayısı : "+course.length+"\n");	
		
		
		CourseManager courseManager=new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		
		System.out.println("Guncel Sepetteki Kurslar : "+course1.courseName+" / "+course2.courseName+"\n");
		
		courseManager.deleteCourse(course1);
		courseManager.deleteCourse(course2);

	}

}
