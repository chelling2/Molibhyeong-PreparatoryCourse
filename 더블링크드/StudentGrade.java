package 더블링크드;

import java.util.Scanner;

//메인클래스
public class StudentGrade {

	public String toString() {
		return "학생등록:1  정보수정:2  학생삭제:3  검색:4  전체출력:5  종료:6";
	}
	
	public static void main(String[] args) {

		StudentMain sm = new StudentMain();
		StudentGrade sg= new StudentGrade();
		Scanner sc = new Scanner(System.in);

		System.out.println("Double Linked List입니다");
		
		while (true) {

			System.out.println(sg.toString());
			int input = sc.nextInt();

			if (input == 1) {
				sm.studentInput();
			}

			else if (input == 2) {
				sm.studentModify();
			}

			else if (input == 3) {
				sm.studentDelete();
			}

			else if (input == 4) {

				sm.studentSearch();
			}

			else if (input == 5) {

				sm.studentOutput();

			}

			else if (input == 6) {
				System.out.println("프로그램을 종료합니다");
				break;
			}

			else {
				System.out.println("잘못 입력하였습니다");
				continue;
			}
		}
	}
}


