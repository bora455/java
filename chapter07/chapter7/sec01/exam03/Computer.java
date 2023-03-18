package sec01.exam03;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Compiter °´Ã¼ÀÇ ararCircle() ½ÇÇà");
		return Math.PI * r * r;
	}

}
