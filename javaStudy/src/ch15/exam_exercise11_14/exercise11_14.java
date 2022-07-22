package ch15.exam_exercise11_14;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise11_14 {

	static ArrayList record = new ArrayList(); // 성적데이터를 저장할 공간
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			switch (displayMenu()) {
			case 1:
				inputRecord();
				break;
			case 2:
				displayRecord();
				break;
			case 3:
				System.out.println(" 프로그램을 종료합니다.");
				System.exit(0);
			}
		} // while(true)

	}

	// menu를 보여주는 메서드
	static int displayMenu() {
		System.out.println("**************************************************");
		System.out.println("* 성적 관리 프로그램  *");
		System.out.println("**************************************************");
		System.out.println();
		System.out.println(" 1.학생성적 입력하기 ");
		System.out.println();
		System.out.println(" 2.학생성적 보기 ");
		System.out.println();
		System.out.println(" 3.프로그램 종료 ");
		System.out.println();
		System.out.print(" 원하는 메뉴를 선택하세요.(1~3) : ");
		int menu = 0;

		do {
			
			String lines = s.nextLine();	// '\n'을 포함해서 읽지만 '\n'을 값을 반환한다.
			// lines = lines.substring(0, lines.length() - 2);
			menu = Integer.parseInt(lines);
			//menu = s.nextInt();	// 문제점 : 마지막에 '\n'이 남는다.
			if (menu < 1 || menu > 3) { // 잘못 입력받은 경우
				System.out.println("매뉴를 잘못 선택하셨습니다. 다시입력해주세요.");
				continue;
			} else { // 올바른 메뉴를 입력 했으면 반복문을 종료
				break;
			}
		} while (true);
		return menu;
	}

	static void inputRecord() {
		System.out.println("1.학생성적 입력하기 ");
		System.out.println("이름 반 번호 국어성적 영어성적 수학성적 의 순서로 공백없이 입력하세요");
		System.out.println(" 입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
		while (true) {	// 여러 학생의 성적을 입력을 받음
			System.out.print(">>");
			
			/*
			  1. Scanner를 이용해서 화면으로 부터 데이터를 입력받는다 .(',' )
			  		한 줄씩 입력 받는다. : nextLine() -> split() 또는 StringTokenizer
			 // 한명의 성적을 입력 받기 : 오류가 있으면 다시 반복 -> 반복문이 필요하다.
			  2. 입력받은 값이 q 또는 Q이면 메서드를 종료하고
			  	그렇지 않으면 입력받은 값으로  Student인스턴스를 생성하고  record에 추가한다
			  3. 입력받은 데이터에서 예외가 발생하면, "입력오류입니다."를 보여주고 다시 입력받는다.
			  4. q 또는 Q 가 입력될떄까지 2~3의 작업을 반복
			 */
			// 1.
			String lines = s.nextLine();	// 한줄씩 입력을 받는다.
			if(lines.contains("q") || lines.contains("Q")) {
				break;	// 반복문을 빠져나가도록
			} else {
				String[] data = lines.split(",");	// 입력받은 데이터를 ","를 사용해서 분리
				// data[0] : 이름, data[1]: 반, data[2]: 번호, data[3]:국어, data[4]: 영어, data[5]: 수학
				try {
				String name = data[0];
				int ban = Integer.parseInt(data[1]);
				int no = Integer.parseInt(data[2]);
				int kor = Integer.parseInt(data[3]);
				int eng = Integer.parseInt(data[4]);
				int math = Integer.parseInt(data[5]);
				Student student = new Student(name, ban, no, kor, eng, math);	
				record.add(student);
				System.out.println("입력완료. 입력을 마치려면 q를 입력");
				}catch(NumberFormatException e) {	// 예외 처리
					System.out.println("입력오류 입니다. 이름 반 번호 국어성적 영어성적 수학성적 의 순서로 입력하세요");
				}catch(ArrayIndexOutOfBoundsException e) {	// 데이터의 일부를 빠뜨리고
					System.out.println("입력오류 입니다. 이름 반 번호 국어성적 영어성적 수학성적 의 순서로 입력하세요");
				}
			}
		} // end of while
	} // public static void inputRecord() {
		// 데이터 목록을 보여주는 메서드

	static void displayRecord() {
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		int length = record.size();
		if (length > 0) {
			System.out.println();
			System.out.println(" 이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수 ");
			System.out.println("====================================================");
			for (int i = 0; i < length; i++) {
				Student student = (Student) record.get(i);
				System.out.println(student);
				koreanTotal += student.kor;
				mathTotal += student.math;
				englishTotal += student.eng;
				total += student.total;
			}
			System.out.println("====================================================");
			System.out.println(" : " + koreanTotal + " " + englishTotal + "총점" + mathTotal + " " + total);
			System.out.println();
		} else {
			System.out.println("====================================================");
			System.out.println(" 데이터가 없습니다.");
			System.out.println("====================================================");
		}
	} // static void displayRecord() {
}

class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank;
	int classRank; // 반등수

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public int compareTo(Object o) {
		if (o instanceof Student) {
			Student tmp = (Student) o;
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage()
				+ "," + schoolRank + "," + classRank;
	}
} // class Student
