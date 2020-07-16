package interface_02;

public interface Inface01 {
	// 1) public static final 변수 선언 가능 : 순서는 상관없다.
	public static final int V1 = 100;
	// int a = 300; //내부적으로는 final임
	// private static final int V2 = 300; -> 불가
	// protected static final int V2 = 300; -> 불가
	static final int V3 = 300;
	public final int V4 = 400;

	// public static int V5; ->선언과 동시에 초기화 해주어야함(상수니까)
	public static int V5 = 500;
	int V6 = 600; // public static int 와 같음

	// 2)public abstract 메서드 선언 가능(추상화)
	public abstract void m1();

	abstract void m2();

	public void m3();

	void m4();

	// private void m5();

	// void m6() {}; body가 있으므로 오류(정의 부분이 존재)
}
