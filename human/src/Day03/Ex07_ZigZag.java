package Day03;

import java.util.Scanner;

public class Ex07_ZigZag {
public static void main(String[] args) {
	//배열의 크기 n을 입력 받아,
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int arr[][] = new int[N][N];
			
	//N*N 구조의 배열에 1부터 시작하여 1씩 증가하는 값을 대입하는데,
	//1 2 3 4 (0,0) (0,1) --> 1씩 증가
	//8 7 6 5 (1,0) (1,1) --> 1씩 감소
	//9 10 11 12 (2,0) --> 1씩 증가
	//16 15 14 13
	

	int sw = 1;
	int k =1;
	
	for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
		    arr[i][j] = k++;

}	
//출력
	
		for (int j = 0 ; j < arr[i].length; j++) {
		    System.out.print(arr[i][j]+ " ");	
					}
			System.out.println();
		}
	sc.close();
	
	}
}


	
		

