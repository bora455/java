package sec01.exam12;
//���� ����
public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-5234567";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("���� �Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("���� �Դϴ�.");
			break;
		case '5':
		case '6':	
		System.out.println("�ܰ��� �Դϴ�.");
		break;
		}

	}

}
