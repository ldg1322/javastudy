package ch03;

public class ShiftOperandExample {

	public static void main(String[] args) {	
		// 비트 이동 연산자는 >>. << . >>>
		// >> : 부호 비트는 유지된다. 부호 비트에 무언가 들어와야 한다. 부호비트 자신이 다시 들어온다.
		// 2로 나눈 것과 동일하다.
		// << : 0번째 비트에 무언가 들어와야 한다. 0이 들어온다.
		// 2로 곱한 것과 동일하다.
		// >>> : 부호비트에 무언가 들어와야 한다. 0이 들어온다. 부호비트가 유지가 안되고 양수가 된다.
		
		int i1 = 4;
		int i2 = i1 >> 2;	// 4로 나눈 것과 같다. ->
		int i3 = i1 << 3;	// 8배한 것 과 동일 -> 32
		System.out.println(i1); 
		System.out.println(i2); 
		System.out.println(i3); 
		
		int a = 80;
		System.out.println(a >> 3);
		// 이동 결과에 a가 저장되지는 않음. (a가 20으로 줄어들어 저장되지는 않음)
		System.out.println(a << 3);
		
		
	}

}
