package sec01.exam19;
//알파벳 소,대문자변경
public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		//- equals : 대소문자 구분을 한다.
        //- equalsIgnoreCase : 대소문자 구분을 하지 않는다.

	}

}
