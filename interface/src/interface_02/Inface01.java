package interface_02;

public interface Inface01 {
	// 1) public static final ���� ���� ���� : ������ �������.
	public static final int V1 = 100;
	// int a = 300; //���������δ� final��
	// private static final int V2 = 300; -> �Ұ�
	// protected static final int V2 = 300; -> �Ұ�
	static final int V3 = 300;
	public final int V4 = 400;

	// public static int V5; ->����� ���ÿ� �ʱ�ȭ ���־����(����ϱ�)
	public static int V5 = 500;
	int V6 = 600; // public static int �� ����

	// 2)public abstract �޼��� ���� ����(�߻�ȭ)
	public abstract void m1();

	abstract void m2();

	public void m3();

	void m4();

	// private void m5();

	// void m6() {}; body�� �����Ƿ� ����(���� �κ��� ����)
}
