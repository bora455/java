package sec02.exam07;

public class DoWhileSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		} while(i<=100);
		
		System.out.println("1~" + (i-1) + "��: " + sum);
		// do-while�� : ������ �������� �ʾƵ� 1ȸ ����

	}

}