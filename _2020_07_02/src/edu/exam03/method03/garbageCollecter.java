/*package edu.exam03.method03;

public class garbageCollecter {

	public class Counter {
		private int no;

		public Counter(int no) {
		this.no = no;
		}
	}
	
	protected void finalize() throws Throwable { // finalize()�� �������̵�
		System.out.println(no + "�� ��ü�� finalize()�� �����");
	}
	
	public static void main(String[] args) {
		 
			Counter counter = null;
			for(int i=1; i<=50; i++) {
				counter = new Counter(i);
				counter = null; // counter ��ü�� ������� ����ϴ�.
				System.gc(); // Garbage Collector  ������ ��û�մϴ�.
			}
	}
}
*/
		
/*
 * �������� �Ҹ�Ǵ� ���� �� �� ���� ���Դϴ�. ���� �Ҹ�Ǵ� ���� �ƴ϶� �޸��� ���¸� ���� �Ϻθ� �Ҹ��ŵ�ϴ�. ����������
 * System.gc()�� Garbage Collector�� ���� ��û������, Garbage Collector�� �޸𸮰� �����Ҷ� , CPU��
 * �Ѱ��� ���� JVM�� ���� �ڵ������� ����.
 */
	


