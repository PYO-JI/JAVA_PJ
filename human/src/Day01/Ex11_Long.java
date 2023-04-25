package Day01;

public class Ex11_Long {

	public static void main(String[] args) {
		//int (4 bytes : 32bits) : 2의 32승개 (43억개)
		//수 표현 범위 : -21억~+21억 
		//long type ( 8 bytes : 8 * 8 = 64bits ) : 2의 64승개
		
		long ln1 = 1000;
		long ln2 = 2100000000;
		long ln3 = 2200000000L; // error 발생 방지 - "숫자L" 
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		System.out.println("int의 최댓값 : " + max);
		System.out.println("int의 최소값 : " + min);

		System.out.println("ln1 :"+ ln1);
		System.out.println("ln2 :"+ ln2);
		System.out.println("ln3 :"+ ln3);
		
	
	}
	
}
