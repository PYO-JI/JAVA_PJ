package Day01;

import java.util.Scanner;

public class Ex14_Intro {
public static void main(String[] args) {
	System.out.println("이름, 나이, 키, 주소를 공백을 두고 입력해보세요");
	
	Scanner sc = new Scanner(System.in);
	
	//String : 문자열을 표현하는 참조 자료형
	//String 변수 = "문자열" ;
	//*데이터 타입 : 8 개 (문자형 - char , 정수형 - byte, short, int, long)
	// 실수형 - float, double, 논리형 - blooean
	
	String name = sc.next(); //문자열 입력 
	System.out.println("이름 : " + name);
	
	int age = sc.nextInt(); // 정수 하나 입력 (next 다음에 정수 int)
	System.out.println("나이 : " +age);
	
	int height = sc.nextInt(); //실수 하나 입력
	System.out.println("키 : " +height);
		
	String address = sc.nextLine(); // 문자열 한 줄 입력
	System.out.println("주소 : " +address);
	
	sc.close();
	
	
}
}
