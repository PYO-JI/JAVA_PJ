package Day02;

import java.util.Scanner;

public class Ex06_If {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("입력 : ");
	int input = sc.nextInt();
	
	//홀수, 짝수 조건? 
	
	if (input % 2 == 1)  //논리연산 "==" 값은 true
	System.out.println("홀수 입니다.");
	
	if (input % 2 == 0)  //논리연산 "==" 값은 true
		System.out.println("짝수 입니다.");
		
	sc.close();
	
	
}
}
