package sec02.exam05;  

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for(int m=3; m<=3; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m + "x" + n + "=" + (m*n));
			}
		}
		// 반복문 : 초기화, 조건, 증감
		// for : 횟수가 정해져 있을 떄
		// while : 값이 정해져 있을 때

	}

}
