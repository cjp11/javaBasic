package edu.exam03.method03;

//import java.util.Scanner;
import java.util.*;
public class Method {
	//public static Scanner sc = new Scanner(System.in);
	
	public static void add() {
		Scanner sc = new Scanner(System.in);	//-> 이렇게 처리하면 add() 1번 수행시는 상관없는데 2번이상 수행하면 에러남
												 // nosuchelemnetexception 오류 생김 
												// 검색결과 scanner는 한번 닫으면 다시 열 수 없기 때문이라고 함.  
		
		System.out.println("숫자 두개 입력: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = a + b;
		System.out.println(res);
		sc.close();
		//System.gc();			-> garbage collection 설명 https://yaboong.github.io/java/2018/06/09/java-garbage-collection/
		/*
		 * 
		 * public class FinalizeExample {
	public static void main(String[] args) {
	Counter counter = null;
	for(int i=1; i<=50; i++) {
	counter = new Counter(i);
	counter = null; // counter 객체를 쓰레기로 만듭니다.
	System.gc(); // Garbage Collector  실행을 요청합니다.
	}
}
}
무작위로 소멸되는 것을 볼 수 있을 것입니다. 
전부 소멸되는 것이 아니라 메모리의 상태를 보고 일부만 소멸시킵니다. 
예제에서는 System.gc()로 Garbage Collector를 실행 요청했지만, 
Garbage Collector는 메모리가 부족할때 ,  CPU가 한가할 때에 JVM에 의해 자동적으로 실행.
		 */
		
	}
	public static void main(String[] args) {
		
			add();
			add();
			//sc.close();

	}

}
