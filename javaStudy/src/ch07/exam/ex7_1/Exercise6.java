package ch07.exam.ex7_1;

import java.awt.Point;

public class Exercise6 {

	/*
	 * (1) 클래스명 : Circle 조상클래스 : Shape 멤버 변수 : double r - 반지름
	 * 
	 * (2) 클래스명 : Rectangle 조상클래스 : Shape 멤버변수 : double width - 폭 double height - 높이
	 * 메서드 : 1. 매서드 명 : IsSquare 기능 : 정사각형인지 아닌지를 알려준다 반환타입 : boolean 매개변수 없음
	 */
	public static void main(String[] args) {
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

		class Rect extends Shape {
			double width;
			double height;

			Rect(double width, double height) {
				this(new Point(0, 0), width, height);
			}

			Rect(Point p, double width, double height) {
				super(p); // . 조상의 멤버는 조상의 생성자가 초기화하도록 한다
				this.width = width;
				this.height = height;
			}

			boolean isSquare() {
				// width height 0 width height true . 나 가 이 아니고 와 가 같으면 를 반환한다
				return width * height != 0 && width == height;
			}

			double calcArea() {
				return width * height;
			}
		}
		class Circle extends Shape {
			double r; // 반지름

			Circle(double r) {
				this(new Point(0, 0), r); // Circle(Point p, double r)를 호출
			}

			Circle(Point p, double r) {
				super(p); // . 조상의 멤버는 조상의 생성자가 초기화하도록 한다
				this.r = r;
			}

			double calcArea() {
				return Math.PI * r * r;
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

	}

}
