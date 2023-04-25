package Day01;

public class Ex09_Byte {
public static void main(String[] args) {
	
	//1byte = 8bits
	//bit : 0 또는 1로 표현한 자리
	//0000 0000
	// 0 1 (2의 1승)
	//00 01 10 11 (2의 2승)
	// 8비트 (2의 8승 - 256)
	//n bits -> 2의 n승 )
	
	//바이트는 1 바이트의 범위의 데이터를 표현한다. (1 byte = 8 bits = 2의 8승 , 256개)
	//양수(0포함) 과 음수로 나누면, -128~127 까지
	
	byte var1 = -128;
	byte var2 = -30;
	byte var3 = 0;
	byte var4 = 30;
	byte var5 = 127;
	byte var6 = (byte)200; 

	System.out.println("var1 : " + var1);
	System.out.println("var2 : " + var2);
	System.out.println("var3 : " + var3);
	System.out.println("var4 : " + var4);
	System.out.println("var5 : " + var5);
	System.out.println("var6 : " + var6);
	
	
}
}
