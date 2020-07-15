package ex03;
/*
 * 	HashMap
 * -> ���� �����ϴ� ��Ģ
 *  - key ��ü�� �ؽ��ڵ带 �̿��Ͽ� value�� �����ϰ� ������
 *  - key�� ����� Ŭ������ �ݵ�� hashCode()�� equals()�� �������̵��ؾ��Ѵ�.
 *  - key�� value�� null�� ����� �� ����.
 *  - Thread-safe ���� �ʴ�. ��Ƽ ������ ȯ���� �����Ѵ�.
 *    ��, ����ȭ ó���� �ӵ��� ������.
 */

import java.util.HashMap;

public class exam01_13 {

	public static void main(String[] args) {
		HashMap<MyKey, Book>map = new HashMap<>();
		
		Book b1 = new Book("1111", "ȫ�浿", 100);
		Book b2 = new Book("2222", "�Ӳ���", 300);
		Book b3 = new Book("3333", "������", 400);
		
		MyKey key1 = new MyKey(10,100);
		MyKey key2 = new MyKey(20,200);
		MyKey key3 = new MyKey(23,9890);

		// 1) �� ����: key ��ü�� �ؽ��ڵ带 �̿��Ͽ� value�� �����Ѵ�. 
		map.put(key1,b1);
		map.put(key2,b2);
		map.put(key3,b3);
		
		// 2) �� ������: Key ��ü�� �ؽ��ڵ带 �̿��Ͽ� value�� ������.
		System.out.println(map.get(key1));
		System.out.println(map.get(key2));
		System.out.println(map.get(key3));
	
		
		MyKey key4 = new MyKey(10,100);			// equals, hashCode ������ �غ���
		System.out.println(map.get(key4));
		System.out.println(key1.hashCode());
		System.out.println(key4.hashCode());
		
	
	}

}
