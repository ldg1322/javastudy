package ch06.annotation_create;

import java.lang.reflect.Method;

public class PrintAnnotationEx {

	public static void main(String[] args) {
		// 리플렉트를 사용해서 메서드 정보를 얻는다.
		// 클래스 Service의 메서드 정보를 얻음
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {	// 각 메서드 별로
			// method1(), method2(), method3()이 반복된다.
			// 어노테이션이 적용된 메서드를 찾는다.
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				// 메서드에 적용된 어노테이션 정보를 가져온다. (value, number 정보를 가져온다)
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				// 어노테이션을 적용 : value에 설정된 문자를 number에 설정된 갯수만큼 출력
				// 메서드 이름 출력
				System.out.println("[" + method.getName() + "]");
				for(int i = 0; i < printAnnotation.number(); i++) {
					System.out.println(printAnnotation.value());
				}
				System.out.println();
				try {
					method.invoke(new Service());
				} catch(Exception e) {}
				System.out.println();
			}
			
		}
	}

}
