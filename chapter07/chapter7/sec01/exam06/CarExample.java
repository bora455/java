package sec01.exam06;

public class CarExample {

	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		
		sc.speedUp = 50;
		System.out.println("�ӵ�: " + Car.speed);
		
		Car.speedup();
		System.out.println("�ӵ�: " + 50);
		
		sc.stop();
		System.out.println("�ӵ�: " + sc.speed);

	}

}
