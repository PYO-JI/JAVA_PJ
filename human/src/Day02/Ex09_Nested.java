package Day02;

import java.util.Scanner;

public class Ex09_Nested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				//정보처리기사 자격증 합격기준 - 4 학년 80점 이상 
		//조건1) 합격 <- 4학년 이면서, 동시에 점수가 60점 이상
		//조건2) 불합격 <-4학년 이지만, 점수가 60 미만인 경우
		//조건3) 응시요건 x <-4학년이 아닌경우
		
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		System.out.println("학년(1~4) :");
		int year = sc.nextInt();
		
		if (year == 4 && score >=60) {
			System.out.println("합격 !");
		}
			if (year == 4 && score <60) {
				System.out.println("불합격 !");
			}		
				if (year !=4) {
					System.out.println("응시요건 X");
				}
	}
}
		
	
	

		