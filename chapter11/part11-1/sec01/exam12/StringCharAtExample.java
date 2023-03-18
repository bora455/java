package sec01.exam12;
//문자 추출
public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-5234567";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다.");
			break;
		case '5':
		case '6':	
		System.out.println("외계인 입니다.");
		break;
		}

	}

}
