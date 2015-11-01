import java.util.ArrayList;
import java.util.Iterator;

public class test{
	public static void main(String[] args) {
		Classroom c = new Classroom();
		Student s1 = new Student(100, "asdf");
		Student s2 = new Student(150, "asf");
		c.addStudent(s1);
		c.addStudent(s2);
		System.out.println(c.getAverageIQ());
	}
}
class Student{
	int subjectiveIntelligenceLevel;
	String name;
	Student(int subjectiveIntelligenceLevel, String name){
		this.subjectiveIntelligenceLevel = subjectiveIntelligenceLevel;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSubjectiveIntelligenceLevel() {
		return subjectiveIntelligenceLevel;
	}
	public void setSubjectiveIntelligenceLevel(int subjectiveIntelligenceLevel) {
		this.subjectiveIntelligenceLevel = subjectiveIntelligenceLevel;
	}
}
class Classroom{
	ArrayList<Student> nerds = new ArrayList<Student>();
	public void addStudent(Student s){
		nerds.add(s);
	}
	public int getAverageIQ(){
		int totalIQ = 0;
		int totalStudents = 0;
		for (Student student : nerds) {
			totalIQ += student.getSubjectiveIntelligenceLevel();
			totalStudents++;
		}
		return totalIQ / totalStudents;
	}
}