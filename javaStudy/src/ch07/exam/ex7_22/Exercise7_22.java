package ch07.exam.ex7_22;

public class Exercise7_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Circle extends Shape {
	double r; // 반지름

	// 생성자 : 원점을 기준으로 하는 원
	Circle() {
		// 부모 생성자를 호출
		super();
	}

	// Point p 기준으로 하는 원
	Circle(Point p) {
		super(p);
	}

	// 원의 면적을 계산
	@Override
	double calcArea() {
		return Math.PI * r *r;	// 원의 면적
	}
}

class Rectangle extends Shape {
	// 멤버 변수
	double width;
	double height;

	// 생성자
	Rectangle() {
	} // 원점을 기준으로 하는 생성자(사각형)

	Rectangle(Point p) { // 임의의 Point p를 기준으로 하는 생성자(사각형)
		super (p);
	}

	// 메서드 반환형
	boolean isSquare() {	// 정사각형인지 아닌지 알려준다.
		// 추가로 정의
//		if(width != 0 && width == height) {	// 정사각형
//			return true;
//		}else {
//			return false; 
//		}
		return (width != 0 && width == height);
	}

	// 사각형의 면적을 계산하는 메서드
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
