package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);;     //car�� setgas() �޼ҵ� ȣ��
		
		boolean gasState = myCar.isLeftGas();    //car�� isleftgas() �޼ҵ� ȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();    //car�� run() �޼ҵ� ȣ��
		}
		
		if(myCar.isLeftGas()) {     //car�� isLeftGas() �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}

	}

}
