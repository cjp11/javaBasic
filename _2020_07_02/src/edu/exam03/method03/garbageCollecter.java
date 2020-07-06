/*package edu.exam03.method03;

public class garbageCollecter {

	public class Counter {
		private int no;

		public Counter(int no) {
		this.no = no;
		}
	}
	
	protected void finalize() throws Throwable { // finalize()를 오버라이딩
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}
	
	public static void main(String[] args) {
		 
			Counter counter = null;
			for(int i=1; i<=50; i++) {
				counter = new Counter(i);
				counter = null; // counter 객체를 쓰레기로 만듭니다.
				System.gc(); // Garbage Collector  실행을 요청합니다.
			}
	}
}
*/
		
/*
 * 무작위로 소멸되는 것을 볼 수 있을 것입니다. 전부 소멸되는 것이 아니라 메모리의 상태를 보고 일부만 소멸시킵니다. 예제에서는
 * System.gc()로 Garbage Collector를 실행 요청했지만, Garbage Collector는 메모리가 부족할때 , CPU가
 * 한가할 때에 JVM에 의해 자동적으로 실행.
 */
	


