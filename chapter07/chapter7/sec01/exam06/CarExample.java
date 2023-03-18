package sec01.exam06;

public class CarExample {

	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		
		sc.speedUp = 50;
		System.out.println("속도: " + Car.speed);
		
		Car.speedup();
		System.out.println("속도: " + 50);
		
		sc.stop();
		System.out.println("속도: " + sc.speed);

	}

}
