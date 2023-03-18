package sec01.exam03;

public interface Remotecontrol {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//메소드
	void turnOn();
	void turnOff();
	void setVoulume(int volume);
}
