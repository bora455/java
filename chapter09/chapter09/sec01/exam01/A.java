package sec01.exam01;

/*�ٱ� Ŭ����*/
public class A {
	
	/*�ν��Ͻ� ��� Ŭ����*/
	A() { System.out.println("A ��ü�� ������"); }
	
	class B {
		B() { System.out.println("B ��ü�� ������"); }
	    int field1;
	    //static int field2;	(x)
	    void method1() { }
	    //static void method2()	(x)
			}
	
	/*���� ��� Ŭ����*/
	static class C {
		C() { System.out.println("C ��ü�� ������"); }
		int field1;
		static int field2;
	    void method1() { }
	    static void method2() {}
			}
	
	/*���� Ŭ����*/
	void method() {
		class D {
			D() { System.out.println("D ��ü�� ������"); }
			int field1;
			//static int field2;
		    void method1() { }
		    //static void method2() {}
		 		}

		    D d =new D();
		    d.field1 = 3;
		    d.method1();
			}
}


