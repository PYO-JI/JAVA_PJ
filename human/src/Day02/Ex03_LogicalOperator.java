package Day02;

public class Ex03_LogicalOperator {
public static void main(String[] args) {
	// AND (&&) - A,B 둘다 true 일때만 true
	// -> 그 외 경우는 모두 false 
	// Or (||) - A,B 둘 중 true 이면 true
	
	System.out.println(true&&true); //true
	System.out.println(true&&false); //false

	System.out.println(true||true); //true 
	System.out.println(true||false); //true
	
	System.out.println(true || (100<50)); //true or false -> ture
	System.out.println((5<20) || (5<2)); // true or false -> true
	System.out.println();

	//XOR(^)
	//A XOR B : A와 B가 다를때, 결과가 true
	
	System.out.println(true ^ true); //false
	System.out.println(true ^ false); //true
	System.out.println((9 >= 2) ^ (7 > 4));  //true ^ true -> false
	System.out.println();
	
	//NOT (!)
	//!A : A가 true 이면 false, A가 False 이면 true로 변환
	System.out.println(!true); //반전 -> false
	System.out.println(!false); //반전 -> true
	System.out.println();
	
	//쇼트서킷 : 논리 연산의 결과를 미리 알아서, 남은 논리식을 확인하지 않는 것
	
	int value1 = 3;
	System.out.println(false && ++value1 > 10); //Dead code -> 쇼트서킷
	System.out.println(value1); //3 (연산자 실행이 안되어 나옴)
	
	int value2 = 3;
	System.out.println(true || ++value2 > 5); 
	System.out.println(value2); // (연산자 실행이 안되어 나옴)
	
	int value3 = 3;
	System.out.println(false & ++value3 > 6); // 논리 연산 false & false -> false
	//비트 연산 일때는 쇼트 서킷이 적용되지 않아 dead code , 뒤에도 연산됨
	System.out.println(value3); //4
	
	int value4 = 3;
	System.out.println(true | ++value4 > 2); 
	System.out.println(value4); //4 = 3+1
	
	
}
}
