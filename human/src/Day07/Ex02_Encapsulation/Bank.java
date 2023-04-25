package Day07.Ex02_Encapsulation;

public class Bank {
	public static void main(String[] args) {
		//객체생성
		Encapsulation ec = new Encapsulation(0,"국민은행","066-121-411-4441", "표지선");
		
		//setter method
		//ec.getDeposit(); <- 직접 접근 불가 " private " 으로 정의했기 때문에 
		
		ec.setDeposit(1000000);
		
		int money = ec.getDeposit();
		System.out.println(ec);
		System.out.println("계좌잔액 : " + money);
		
		
	}

}
