package Day07.Ex06_UpdownCasting;

public class Person {
	
	//부모클래스 - 변수 정의 
	String name;
	int age;
	
	//생성자 생성
	public Person() {
		this("이름없음",0);		
	}
	
	//매개변수 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//getter, setter
	public String work() {
		return "일을 합니다.";
	}
		
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
		

}
