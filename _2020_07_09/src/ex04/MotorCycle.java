package ex04;

public class MotorCycle extends Motor {
	int muffler;
	
	public MotorCycle() {
		System.out.println("MoterCycle() ȣ���");
	}
	
	public MotorCycle(int muffler) {
		this();
		this.muffler = muffler;
	}
}
