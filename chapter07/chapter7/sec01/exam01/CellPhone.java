package sec01.exam01;

public class CellPhone {
	//필드
	String model;
	String color;
	
	//텍스트
	void powereOn() { System.out.println("전원을 켭니다."); }
	void powerOff() { System.out.println("전원을 켭니다."); }
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String  message) { System.out.println("자기: " + message); }
	void receiveVoice(String message) { System.out.println("상대방 : " + message); }
	void hangup() {System.out.println("전화를 끊습니다.");
	}

}
