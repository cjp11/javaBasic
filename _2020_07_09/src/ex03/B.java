package ex03;

public class B extends A{
/*
 * 수퍼 클래스 A의 static 변수는 클래스 소속이기 때문에
 * 직접 상속받는 것이 아니다. -> ex) static int var1 (공유임)
 * 대신 자신의 것처럼 사용할 수 있다. 
 * 
 */
	static int var3;
	static void m() {
		// 클래스 변수를 사용하려면 클래스명을 붙여야 한다. 
		A.var1 = 100;
		
		// 서브 클래스에서는 수퍼 클래스의 스태틱 변수에 접근할 수 있다. (위의 표현을 써도되고 아래 표현을 써도 됨)
		var1 = 200;
		
		//var2 = 100; 인스턴스 변수라 사용못함. 
		B.var3 = 200;
		var3 = 300;
	}
	
}
