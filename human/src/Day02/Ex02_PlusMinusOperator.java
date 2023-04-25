package Day02;

public class Ex02_PlusMinusOperator {
public static void main(String[] args) {
	
	int a = 10;
	int b = 20;
	int c ;

	//증감연산자
	//++a, a++ : a를 1 증가
	//--a, a-- : a를 1 감소
	
	//전위 연산자 : 연산자 우선순위가 가장 높다
	
	c = ++a + b;
	
	System.out.println("c=" +c); //11 + 20 = 31
	System.out.println("a=" +a); //11
	
	int x = 10;
	int y = 20;
	int z;
	
	z = x++ + y;
	System.out.println("z=" +z); //10+20 = 30
	System.out.println("x=" +x); //10 +1 =11
}
}
