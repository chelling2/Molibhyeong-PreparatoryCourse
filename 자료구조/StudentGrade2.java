import java.util.Scanner;

// ����Ŭ����

public class StudentGrade2 {

	
	public String toString() {
		return "�л����:1  ��������:2  �л�����:3  �˻�:4  ��ü���:5  ����:6";
	}
	
	public static void main(String[] args) {

		StudentMain2 sm = new StudentMain2();

		Scanner sc = new Scanner(System.in);

		System.out.println("Set�Դϴ�");
		
		StudentGrade2 sa= new StudentGrade2();
		
		
		while (true) {
			
			System.out.println(sa.toString());
						
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
				System.out.println("���α׷��� �����մϴ�");
				break;
			}

			else {
				System.out.println("�߸� �Է��Ͽ����ϴ�");
				continue;
			}
		}
	}
}
