package Day01;

import java.util.Scanner;

public class Ex05_InputDouble {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
System.out.print("x : ");
int x = sc.nextInt();

System.out.print("y : ");
int y = sc.nextInt();

System.out.print("z : ");
int z = sc.nextInt();

int sum = x + y + z;
double avg = (double) sum / 3;

System.out.println("합계 : " + sum);
System.out.println("평균 : " + avg);


//자동 형 변환 (작은 타입 -> 큰 타입 대입할때, 자동으로 큰 타입으로 변환하는 것)
//강제 형 변환 ( 큰타입을 작은 타입에 대입할때, 명시적으로 타입을 변환하는 것)
//*일반적으로 작은 타입과 큰 타입을 연산하면 연산결과는 큰 타입이 된다.

sc.close();

}
}