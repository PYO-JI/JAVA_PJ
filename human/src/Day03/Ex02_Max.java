package Day03;

import java.util.Scanner;

public class Ex02_Max{

	public static void main(String[] args) {

		   //첫째 줄에 입력할 개수 n을 입력받고
		   //둘쨰 줄에 n개의 정수를 공백을 두고 입력
		   //n개의 정수 중, 최댓값을 구하여 출력
		   //90 60 70 100 55
		
//정수하나를 입력 받는다  		
	Scanner sc = new Scanner(System.in);
//입력받은 정수를 변수 N에 대입한다.
	int N = sc.nextInt();
	int arr[] = new int[N];
	
//N번 반복하여 N개의 정수를 입력받는다.
	for (int i =0; i<N; i++) {
//입력받은 N개의 정수를 배열 arr에 저장한다
	arr[i] = sc.nextInt();
	}
	
//배열 arr 를 반복하여, max 와 i 번째 요소를 비교한다.
	int min = Integer.MAX_VALUE;
	for (int i = 0; i <arr.length; i++) {
//두 요소 중 더 큰 요소를 변수 max에 대입한다
		
		if(min >arr[i])
		min = arr[i];
	}
	System.out.println("최솟값 : " + min);
	}
	}


			
		