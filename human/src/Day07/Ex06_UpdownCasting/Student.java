package Day07.Ex06_UpdownCasting;

public class Student extends Person {
	//상속 person
	
	int grade;
	String major;
	
	//student 매개변수 지정
	
	public Student() {
		this("이름없음",0,0,"없음");
	}
	public Student(String name, int age,int grade, String major) {
		super(name, age);
		this.grade = grade;
		this.major = major;
	}
	
	public String work() {
		return "공부를 합니다.";
							
	}
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", major=" + major + "]";
	}
	

}
