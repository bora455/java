package sec01.exam01;

public class CellPhone {
	//�ʵ�
	String model;
	String color;
	
	//�ؽ�Ʈ
	void powereOn() { System.out.println("������ �մϴ�."); }
	void powerOff() { System.out.println("������ �մϴ�."); }
	void bell() {System.out.println("���� �︳�ϴ�.");}
	void sendVoice(String  message) { System.out.println("�ڱ�: " + message); }
	void receiveVoice(String message) { System.out.println("���� : " + message); }
	void hangup() {System.out.println("��ȭ�� �����ϴ�.");
	}

}
