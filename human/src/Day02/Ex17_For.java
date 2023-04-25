package Day02;

import java.util.Iterator;

public class Ex17_For {

	public static void main(String[] args) {
		//for(1초기식 ; 2조건식; 3증감식; 4증감식 ) {3실행문;}
		//실행순서 : 1 ->반복(2→3→4)
		
		//1~10 까지의 정수를 출력하시오.
		for (int i = 1; i < 10 ; i++) {
	System.out.println(i +"");
		}
		System.out.println();
			
		//2. 50~100 까지의 정수를 출력하시오.
		for (int i = 50; i <= 100 ; i++) {
			System.out.println(i +"");
				}
		
		//3. 1~20 까지의 짝수를 출력하시오.
		for (int i = 2; i <= 20 ; i += 2 ) {
			System.out.println(i +"");
				}
		
		//4. 1~20 까지의 홀수를 출력하시오
		for (int i = 1; i <= 20 ; i += 2 ) {
			System.out.println(i +"");
				}
}			
		
	}
