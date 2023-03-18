package sec02.exam03;

public class Button {
	static interface OnClickListener {
		void onClick(); }
	
	OnClickListener Listener;
	
	void setOnClickListener(OnClickListener Listener) {
		this.Listener = Listener;
	}
	
	void touch() {
		Listener.onClick();
	}
}
