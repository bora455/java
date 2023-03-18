package sec01.exam06;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn1 = new Button();
		btn1.setOnClickListener(new CallListener());
		btn1.touch();
		
		Button btn2 = new Button();
		btn2.setOnClickListener(new MessageListener());
		btn2.touch();

	}

}
