import java.util.*;

public class Program {

	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
	
		
		while (true) {

			System.out.println("1.1�� ���α׷� 2.���ھ߱� 3.3�� ���α׷� 4.�޷� 5.����");
			
			switch (sc.nextInt()) {

			case 1:
				P1.good();
				break;
			case 2:
				Baseball.good();
				break;
			case 3:
				P3.good();
				break;
			case 4:
				P4.good();
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�");
				return;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�");
				continue;
			}
		}
		
	

	}

}
