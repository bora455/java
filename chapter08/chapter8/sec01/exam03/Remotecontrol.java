package sec01.exam03;

public interface Remotecontrol {
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�޼ҵ�
	void turnOn();
	void turnOff();
	void setVoulume(int volume);
}
