package sec02.exam03;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener Listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	Window() {
		button1.setOnClickListener(Listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�.");
			}
		});
	}

}