package step01.ex01;

public class ShapeMain {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		print(r);
		print(t);

	}
	
	static void print(Shape s) {
		if(s instanceof Rectangle) {
			Rectangle r = (Rectangle)s;
			r.Draw();
		}
		if(s instanceof Triangle) {
			Triangle t = (Triangle)s;
			t.Draw();
		}
	}

}
