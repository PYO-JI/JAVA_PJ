package Day04.Class;

public class Pikachu {
	//클래스 : 객체를 정의하는 설계도
	//멤버 : 변수, 메소드
	
	//변수
	public int energy;
	public String type;
	public int level;	
	
	//생성자 정의 
	public Pikachu() {
	//energy = 100;
	//type = "전기";
		this(100,"전기"); 
	}
	
	//생성자 자동완성 " alt + shift + s ->0 "
	//매개변수가 있는 생성자
	//method over loading - " 메소드 중복정의"
	
	public Pikachu(int energy, String type) {
	    //this : 객체 자기 자신을 가리키는 레퍼런스
		//this.energy = energy;
		//this.type = type;
		this(energy, type, 1);
		
		//-> 한줄 변경 가능 this(100, "전기");
	}
	
	//level 생성자 추가 생성
	public Pikachu(int energy, String type, int level) {
		this.energy = energy;
		this.type = type;
		this.level = level;
	}

	//메소드
	//접근 지정자 반환타입 메소드명 (매개변수){}
	
	public String aAttack() {
	return "십만볼트";
	}
	
	public String bAttack() {
		return "전광석화";
	}
	
	public String cAttack() {
		return "(피카츄 넌 사용못함)";
	}

	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + ", level=" + level + "]";
	}
		
	
	
	
}