package sec02.exam07;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		
		}
		
		System.out.println("1~" + (i-1) + "합 : " + sum);
		// while문 : 조건을 충족하지 않으면 0회 시행

	}

}
