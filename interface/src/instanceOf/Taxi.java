package instanceOf;

public class Taxi implements Vehicle{
	public void run() {
		System.out.println("택시 달린다");
	}
	public void speed() {
		System.out.println("택시 시속 50km/h");
	}
}
