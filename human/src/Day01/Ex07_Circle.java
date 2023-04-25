package Day01;

import java.util.Scanner;

//import : 외부에서 정의된 클래스 파일을 포함하는 키워드
//*자동 import 하는 방법
//1. 클래스 명 + ctrl + space
//2. 다중 : ctrl + shift + O

/**
 * 반지름을 입력 받아, 원의 넓이를 구하는 프로그램
 * @author 휴먼
 *
 */

public class Ex07_Circle {

	public static void main(String[] args) {
		final double PI = 3.141592;
		
		//PI = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");
		double radius = sc.nextDouble();
		double area = PI * radius * radius;
		
		System.out.println("원의 넓이 : " + area);
		sc.close();
		
	}
	
}
