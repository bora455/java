package sec01.exam03;

public class A {
	int field1;
	void method1() {}

	static int field2;
    static void method2() {}
    
    class B   {
    void method() {
    	field1 = 10;
    	method1();
    	
    	field2 = 10;
    	method2();
    	}
    	}

static class C {
	void method() {
		//field1 = 10;   멤버 클래스 내부에서 바깥 클래스의 필드와 메소드의 접근하는 경우
		//method1();
		
		field2 = 10;
		method2();
	}
}
}