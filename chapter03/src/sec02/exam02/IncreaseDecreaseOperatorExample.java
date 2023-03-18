package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x=10;
		int y=10;
		int z;
		
		System.out.println("------------------------");
		x++;   // 연산 후 증가
		++x;   // 증가 후 연산
		System.out.println("x="+x);
		
		System.out.println("------------------------");
		y--;
		--y;
		System.out.println("y="+y);
		
		System.out.println("------------------------");
		z=x++;
		System.out.println("z="+z);
		System.out.println("x="+x);  // 14
		
		System.out.println("------------------------");
		z=++x;
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("------------------------");
		z=++x + y++;
		System.out.println("z="+z);  // 16+8=24
		System.out.println("x="+x);  // 16
		System.out.println("y="+y);  // 10
		
		
		// TODO Auto-generated method stub

	}

}
