import java.util.Scanner;

// HashMap

public class StudentGrade3 {

	public String toString() {
		return "�л����:1  ��������:2  �л�����:3  �˻�:4  ��ü���:5  ����:6";
	}
	
	public static void main(String[] args) {

		StudentMain3 sm = new StudentMain3();
		StudentGrade3 sg = new StudentGrade3();
		Scanner sc = new Scanner(System.in);

		System.out.println("Map�Դϴ�");
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
