package sec01.exam01;

public class Main {

	public static void main(String[] args) {
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//���� ��� Ŭ���� ��ü ����
		A.C c = new A.C();
		
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();

	}

}
