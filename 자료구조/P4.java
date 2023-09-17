import java.util.*;

public class P4 {
	private int year;
	private int month;
	private int monthSet[];
	private int nalsu;
	private int week;
	private int i;
	
	public P4() {
		
		monthSet= new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//각월마다 총일수
	}
	
	public void st() {
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {  // 윤년인지 평년인지 구하는데 조건이 참이면 윤년 
			monthSet[1] = 29;
		}

		nalsu = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400; //날수 공식

		// 이전 월까지 날 수 
		for (i = 0; i < (month - 1); i++) {
			nalsu += monthSet[i];
		}

		nalsu += 1;
		
		week = nalsu % 7;
		
		System.out.println();
		
		System.out.println("       " + year + "년    " + month  +"월");
		
		System.out.println();
		System.out.println();

		 System.out.println(" 일  월  화  수  목  금  토");
		System.out.println("--------------------------------");

		// 공백지정
		int count = week;
		for (i = 0; i <= count; i++) {
			System.out.printf("%2s ","");
		}

		for (i = 1; i < monthSet[month - 1]+1; i++) {

			System.out.printf("%3d ", i);
			week++;
			
			if (week % 7 == 0)
				System.out.println();

		}
		
		if (week % 7 != 0)
			System.out.println();

		System.out.println("--------------------------------");
		
	}
	
	
	public static void good() {
		
		P4 p4 = new P4();

		Scanner sc = new Scanner(System.in);

		System.out.printf("연도를 입력하세요. >>");
		p4.year = sc.nextInt();
		
		System.out.printf("월을 입력하세요. >>");
		p4.month = sc.nextInt();
	
		p4.st();

		LinkedList ll = new LinkedList();
		
	}

}
