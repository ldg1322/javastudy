package ch07.exam.ex7_23;

public class Exercise7_23 {

	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("면적의 합 :" + sumArea(arr));

	}

	// sumArea() 메서드를 정의 : 3개의 도형에 대한 면적을 계산
	static double sumArea(Shape[] arr) {
		// 주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환
		double areas = 0.0;
		for(Shape s : arr) {
			areas += s.calcArea();
		}
		return areas;
	}
}

class Circle extends Shape {
	double r; // 반지름

	// 생성자 : 원점을 기준으로 하는 원
	Circle(double r) {
		// 부모 생성자를 호출
		this.r = r;
	}

	// Point p 기준으로 하는 원
	Circle(Point p, double r) {
		super(p);
		this.r = r;
	}

	// 원의 면적을 계산
	@Override
	double calcArea() {
		return Math.PI * r * r; // 원의 면적
	}

}

class Rectangle extends Shape {
	// 멤버 변수
	double width;
	double height;

	Rectangle(double width, double height) {
		this(new Point(0,0), width, height);
	} // 원점을 기준으로 하는 생성자(사각형)

	Rectangle(Point p, double width, double height) { // 임의의 Point p를 기준으로 하는 생성자(사각형)
		super(p);
		this.width = width;
		this.height = height;
		
	}

	@Override
	double calcArea() {
		return width * height;
	}
}

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}


class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}