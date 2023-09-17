import java.util.*;

public class Program {

	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
	
		
		while (true) {

			System.out.println("1.1번 프로그램 2.숫자야구 3.3번 프로그램 4.달력 5.종료");
			
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
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("잘못 입력하였습니다");
				continue;
			}
		}
		
	

	}

}
