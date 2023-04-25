package Day07.Ex06_UpdownCasting;

public class UpCasting {
	public static void main(String[] args) {
		//업캐스팅 (자동 타입 변환)
		//부모 클래스 = 자식클래스
		Person person = new Student("김휴먼",20,1,"");
		//업캐스팅 할떈
		//변수는 person꺼
		//메소드는 student꺼		
		
		//Person : name, age
		//Student : name, age, grade, major
		System.out.println("name :" + person.name);
		System.out.println("age :" + person.age);
		
		//Person 객체에서는 grade, major 변수를 접근할 수 없다.
		//System.out.println("grade :" + person.grade); <-접근 불가
		//System.out.println("major :" + person.major); <-접근 불가
		
		
		//클래스를 업캐스팅 하면,
		//변수는 부모클래스에 있는 변수만 접근 가능하고,
		//메소드는 자식 클래스의 메소드가 우선하여 실행된다.
		
		//바인딩(binding)
		//:프로그램에서 사용되는 요소에 실제 값을 결정짓는 행위
		
		//정적 바인딩 : 컴파일 시간에 결정 (변수)
		//동적 바인딩 : 실행 시간에 결정 (메소드, overriding 등)		
		
		System.out.println(person);
		System.out.println(person.work());
		
		
	}
	

}
