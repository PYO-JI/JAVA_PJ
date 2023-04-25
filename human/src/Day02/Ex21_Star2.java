package Day02;

import java.util.Scanner;

public class Ex21_Star2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int N =sc.nextInt();
 
		sc.close();
		
		for (int i = 1; i <=N ; i++) {
			//i =1, j =12345 
			//i =2, j =1234
					
			for (int j = N; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
	}

	}
}

