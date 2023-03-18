package sec02.exam09;

public class LogicOperatorExample {

	public static void main(String[] args) {
		
		int charCode='A';
				
		
		//논리곱 : 모두 true일 떄만 true
				if( (charCode>=65) & (charCode<=90) ) {
					System.out.println("대문자 이군요");
				}
		
				if( (charCode>=97) && (charCode<=122) ) {
					System.out.println("소문자 이군요");
				}
						
				if( !(charCode<48) && !(charCode>57) ) {
					System.out.println("0~9 숫자 이군요");
				}
					
				
		//논리합: 하나만 true면 true
				int value=6;
				if( (value%2==0) | (value%3==0) ) {
					System.out.println("2 또는 3의 배수 이군요");
				}
				if( (value%2==0) || (value%3==0) ) {
					System.out.println("2 또는 3의 배수 이군요");
				
				}
		// TODO Auto-generated method stub

	}

}
