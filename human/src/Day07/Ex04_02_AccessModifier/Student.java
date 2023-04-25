package Day07.Ex04_02_AccessModifier;

import Day07.Ex04_01_AccessModifier.person;

public class Student extends person {

	//generate contructor from superclass
	
	public Student() {
		super();
	}

	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
	}

	//메소드 작성
	public void defaultSetting() {
		name = "이름없음" ;    //public ->같은 클래스 내에서만 접근 가능
		height = 160;       //protected -> 같은 패키지 + 다른 패키지의 자식 클래스에서 접근 가능
		//age = 20; 	    //default 라서 다른패키지에 있으므로 접근 불가
		//weight = 50;      //private -> 
		setAge(20);
		setWeight(50);

		
		
	}
	
}

