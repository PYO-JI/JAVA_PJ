package Day04.Ex03_Car;

public class CarEx {

	//객체생성
	public static void main(String[] args) {
		Car car = new Car();
		car.model = "제네시스";
		car.setSpeed(200);
		System.out.println("모델명 : " + car.getModel());
		System.out.println("속도 : " + car.getSpeed());
		
		//car.speed = 200;
		//private 으로 지정한 변수는 외부에서 접근 불가능
		
		car.setSpeed(-100); // if 절로 속도값 보정 제한둠
		System.out.println("속도 : " + car.getSpeed());
		
		car.setSpeed(500);
		System.out.println("속도 : " + car.getSpeed());
		
		car.setSpeed(80);
		System.out.println("속도 : " + car.getSpeed());
	
		
	}
}