package Day01;

import java.util.Scanner;

/**
 * 자바 기본 입출력
 * @author 휴먼
 *
 */
public class Ex02_Scanner {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("A : ");
	int a = sc.nextInt();
		
		//"문자열" : 큰따옴표 -> "문자열" + 숫자
System.out.println("A : " + a);

		sc.close();
	

	}
}
