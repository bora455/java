package sec02.exam08;  //p.81

public class StringConcatExample {

	public static void main(String[] args) {
		int value=10+2+8;  //����+���� -> int (�������)
		System.out.println("value:"+value);
		
		String str1=10+2+"8";  // ''-> char ""-> string (���Ῥ��)
		System.out.println("str1:"+str1);
		
		String str2=10+"2"+8;
		System.out.println("str2:"+str2);
		
		String str3="10"+2+8;
		System.out.println("str3:"+str3);
		
		String str4="10"+(2+8);
		System.out.println("str4:"+str4);
		
		// TODO Auto-generated method stub

	}

}