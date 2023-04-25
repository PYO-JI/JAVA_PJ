package Day07.Ex04_02_AccessModifier;

public class Manager {

	 public static void main(String[] args) {
		//객체생성
		Student student = new Student();
		student.defaultSetting();
		System.out.println("name : " +student.name);
		System.out.println("height : " + student.getHeight()); //student.height <-접근 불가
		System.out.println("age : " + student.getAge());
		System.out.println("weight : " + student.getWeight());
		
		System.out.println();
		
		Person person = new Person("김휴먼", 175,20,60);
		System.out.println("name : " +person.name);
		System.out.println("height : " + person.height); //student.height <-접근 불가
		System.out.println("age : " + person.age);
		System.out.println("weight : " + person.weight);
		
	}
	
}
