package sec01.exam02;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//key ��ü�� �ĺ�Ű�� ����ؼ� string ���� �����ϴ� hashmap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		//�ĺ�Ű new key(1)�� "�躸��"�� ������
		hashMap.put(new Key(1), "�躸��");
		//�ĺ�Ű new key(1)�� "�躸��"�� ������
		String value = hashMap.get(new Key(1));
		System.out.println(value);

	}

}
