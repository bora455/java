package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);;     //car의 setgas() 메소드 호출
		
		boolean gasState = myCar.isLeftGas();    //car의 isleftgas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();    //car의 run() 메소드 호출
		}
		
		if(myCar.isLeftGas()) {     //car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}

	}

}
