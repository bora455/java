package sec01.exam06;

public class Car {
	public static int speed;
	
	public static void speedup() {
		System.out.println("���� �����");
		speed += 1;
	}

	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}

	public void speedUp() {
	}
}
