package Day02;

import java.util.Scanner;

public class Ex19_GuguAll {
	public static void main(String[] args) {
		//구구단 모두 출력 
		
		for (int i = 2; i<=9; i++) {
			
			for (int j = 1; j<=9; j++) {
		  	System.out.print(i + "*" + j + "=" + i * j);
		    System.out.print("\t");
			}
			
	System.out.println();
	}
}
}