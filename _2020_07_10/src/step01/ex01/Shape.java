package step01.ex01;

class Shape {
	void Draw() {
		System.out.println("Shape 그리기");
	}
}

class Triangle extends Shape {
	void Draw() {
		System.out.println("Triangle 그리기");
	}
}

class Rectangle extends Shape {
	void Draw() {
		System.out.println("Rectangle 그리기");
	}
}
