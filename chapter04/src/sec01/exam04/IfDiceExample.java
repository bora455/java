package sec01.exam04;  

public class IfDiceExample {

	public static void main(String[] args) {
		int num=(int)(Math.random()*6)+1;  // 0 <= x < 1  
		// 0 0.1 0.2 0.3 ... *6
		// 0 0.6 1.2 1.8 ... +1 
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}	
		// TODO Auto-generated method stub

	}

}
