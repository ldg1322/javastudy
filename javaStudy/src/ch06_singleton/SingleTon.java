package ch06_singleton;

import java.util.ArrayList;
import java.util.List;

/*
 * 싱글톤 : 어플리케이션내에서 객체가 하나만 존재하는 것
 * 보통은 공통 데이터를 관리(저장, 검색)하거나 시간을 저장
 * 여러개의 인스턴스를 만들지 말고 하나에서 관리를 할 떄 사용
 * 싱글톤을 만드는 방법 : 객체가 하나만 존재
 * 다른 클래스에서 객체를 생성할 수 없음 -> private 생성자를 사용 
 */
public class SingleTon {
	// 생성자 : private 접근제한자를 가진다. -> 다른 클래스에서 생성자를 호출 할 수 없음
	private SingleTon() {}
	// 객체의 생성은 자기 자신이 한다.
	// 정적 피드, 접근제한자가 private -> 다른 클래스는 접근 불가
	private static SingleTon instance = null;	// 참조 변수 -> 참조하지 않는다.
	// 객체의 주소를 얻을 수 있는 Getter(메서드)를 제공
	// 정적 메서드 -> 객체의 생성없이 접근할  수 있도록 정적 메서드로 만든다.
	// 접근 제한자를 public 어느 클래스든지 접근할 수 있음
	public static SingleTon getInstance() {
		if(instance == null) {
			instance = new SingleTon();	// 객체를 생성
		}
		return instance;	// 객체의 SingleTon에 접근할 수 있는 주소를 반환 (제공)
	}
	
	// 어떤 데이터 저장하거나 
	List<String> list = new ArrayList<String>();
	// 인스턴스 필드
	private int value;
	
	// 인스턴스 메서드 : Getter
	public int getValue() {
		return value;
	}
	
	// 인스턴스 메서드 : Setter -> 필드의 값을 매개변수로 주어진 값으로 변경하는 메서드
	public void setValue(int value) {
		this.value = value;
	}
}
