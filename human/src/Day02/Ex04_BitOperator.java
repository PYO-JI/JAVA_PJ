package Day02;

public class Ex04_BitOperator {
public static void main(String[] args) {
	
	//AND
	//20 (십진수 ) --> 0001 0100 (이진수)
	//16 (십진수 ) --> 0001 0000 (이진수) * 이진수 : 0 또는 1로만 표현
	
int result = 20 & 16; // 16으로 나옴
System.out.println("[AND 비트연산]");
System.out.println(result);
System.out.println(Integer.toBinaryString(20));         //0001 0100
System.out.println(Integer.toBinaryString(16));         //0001 0000
System.out.println("----------"); //0001 0000 (두결과 1이어야 1)
System.out.println(Integer.toBinaryString(result));
System.out.println();
	
int result1 = 20 | 16; // 20으로 나옴
System.out.println("[Or 연산]");
System.out.println(result1);
System.out.println(Integer.toBinaryString(20));         //0001 0100
System.out.println(Integer.toBinaryString(16));         //0001 0000
System.out.println("----------"); //0001 0100
System.out.println(Integer.toBinaryString(result1));
System.out.println();	


int result2 = 20 ^ 16; // 4으로 나옴
System.out.println("[XOR 연산]");
System.out.println(result2);
System.out.println(Integer.toBinaryString(20));         //0001 0100
System.out.println(Integer.toBinaryString(16));         //0001 0000
System.out.println("----------"); //0000 0100
System.out.println(Integer.toBinaryString(result2));
System.out.println();	


int result3 = ~20; // int = 4 bytes ( 2의 4승 = 32 bits)
System.out.println("[NOT 연산]");
System.out.println(result3); //-21 으로 어떻게 나올까? 11111111111111111111111111101011 (32 bits) ?
						                        //맨 앞의 숫자 "1"은 부호(+/-)입니다. *최상위비트(MSB)

System.out.println(Integer.toBinaryString(20));   //~0001 0100
System.out.println("----------"); //1110 1011 (반전)
System.out.println(Integer.toBinaryString(result3));
System.out.println();	

// 0000 0000 0000 0000 0000 0000 0000 0010 : 2의 1승 -> "2" (십진수)
//만약 -2로 바꾸고 싶다? => 2의 보수 연산 필요 (1의 보수 연산에 -를 취하고, +1 을 취함)
// 1111 1111 1111 1111 1111 1111 1111 1101 : 1의 보수 연산
//										+1 ; 1을 더함
// 1111 1111 1111 1111 1111 1111 1111 1110 : -2

int result4 = ~20 +1; // int = 4 bytes ( 2의 4승 = 32 bits)
System.out.println("[NOT 연산]");
System.out.println(result4);
System.out.println(Integer.toBinaryString(20)+1);   //~0001 0100
System.out.println("----------"); //1110 1011 (반전)
System.out.println(Integer.toBinaryString(result4));
System.out.println();	



//SHift 연산 - 산술 시프트 ( <<. >> ) : 부호 비트를 유지하면서, 왼쪽 또는 오른쪽으로 비트를 이동시키는 연산자
//          - 논리 시프트 ( <<<, >>> ) : 부호 비트를 포함하여, 전체를 왼쪽 또는 오른쪾으로 비트를 이동시키는 연산자

// 0000 0010 -> 2 (2의 1승)
// 0000 0100 -> 4 (2의 2승)
// 0000 1000 -> 8 (2의 3승)

System.out.println("<<연산하면 2배씩 증가");
System.out.println(2 << 1); //4 (2*2)
System.out.println(2 << 2); //8 (4*2)
System.out.println(2 << 3); //16 (8*2)
System.out.println();

System.out.println(">>연산하면 1/2배씩 감소");
System.out.println(2 >> 1); //1 ( 2 * 1/2 )
System.out.println(2 >> 2); //0  
System.out.println(2 >> 3); //0
System.out.println();

System.out.println("부호가 있는 경우 2배씩 증가");
System.out.println(-2 << 1); //-4
System.out.println(-2 >> 1); //-1
System.out.println(-2 << 2); //-8
System.out.println(-2 << 3); //-16
System.out.println();

System.out.println(2 >> 1); //1 ( 
System.out.println(-2 >>> 31); //1 (논리 shift 가 되어 부호 bit도 이동됨) , 2의 0승 = 1
System.out.println(Integer.toBinaryString(2));
System.out.println(Integer.toBinaryString(-2));
System.out.println();



}
}
