package ch06.getter.setter;

// 웹 애플리케이션을 개발할 때 빈을 생성하는 방법
// 필드는 private으로 접근 제한자를 사용
// Getter와 Setter를 public 접근 제한자를 사용
// 스프링에서는 lombok 라이브러리를 사용
public class Member {
	// 필드
	private String id;
	private String name;
	private String pw;
	private String tel;
	private String email;
	private String add;
	private boolean adult;
	
	// 생성자
	public Member(String id, String name, String pw, String tel, String email, String add, boolean adult) {
		super();		// Object 클래스의 생성자를 호출
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.tel = tel;
		this.email = email;
		this.add = add;
		this.adult = adult;
	}
	
	// Getter : 필드 값을 얻는 방법을 제공하는 메서드
	public String getId() {
		return id;
	}
	// Getter를 만들어주지 않으면 필드에 접근할 수 있는(읽는) 방법이 없음
	
	// Setter : 필드 값을 변경하는 방법을 제공하는 메서드 
	public void setId(String id) {
		this.id = id;
	}
	// Setter가 없으면 수정할 수 있는 방법이 없음

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
}
