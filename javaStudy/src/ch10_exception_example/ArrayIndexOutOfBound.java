package ch10_exception_example;

// 허용되지 않은 메모리 영역을 침범하는 경우 발생 -> OS는 자신의 프로그램에 할당한 메모리 영역만 사용하게 하고
// 그 외의 영역을 접근하려고 하면 프로그램을 죽여버린다.
public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		if(args.length != 2) {	// 파라미터를 잘못 입력할 경우 올바른 사용법을 안내한다.
			System.out.println("사용법 : java ArrayIndexOutOfBound 10 20");
			System.exit(1);
		}
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]:" + data2);

	}

}
