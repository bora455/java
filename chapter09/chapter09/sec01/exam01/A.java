package sec01.exam01;

/*¹Ù±ù Å¬·¡½º*/
public class A {
	
	/*ÀÎ½ºÅÏ½º ¸â¹ö Å¬·¡½º*/
	A() { System.out.println("A °´Ã¼°¡ »ý¼ºµÊ"); }
	
	class B {
		B() { System.out.println("B °´Ã¼°¡ »ý¼ºµÊ"); }
	    int field1;
	    //static int field2;	(x)
	    void method1() { }
	    //static void method2()	(x)
			}
	
	/*Á¤Àû ¸â¹ö Å¬·¡½º*/
	static class C {
		C() { System.out.println("C °´Ã¼°¡ »ý¼ºµÊ"); }
		int field1;
		static int field2;
	    void method1() { }
	    static void method2() {}
			}
	
	/*·ÎÄÃ Å¬·¡½º*/
	void method() {
		class D {
			D() { System.out.println("D °´Ã¼°¡ »ý¼ºµÊ"); }
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


