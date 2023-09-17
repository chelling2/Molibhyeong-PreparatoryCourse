import java.util.*;

public class P4 {
	private int year;
	private int month;
	private int monthSet[];
	private int nalsu;
	private int week;
	private int i;
	
	public P4() {
		
		monthSet= new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//�������� ���ϼ�
	}
	
	public void st() {
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {  // �������� ������� ���ϴµ� ������ ���̸� ���� 
			monthSet[1] = 29;
		}

		nalsu = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400; //���� ����

		// ���� ������ �� �� 
		for (i = 0; i < (month - 1); i++) {
			nalsu += monthSet[i];
		}

		nalsu += 1;
		
		week = nalsu % 7;
		
		System.out.println();
		
		System.out.println("       " + year + "��    " + month  +"��");
		
		System.out.println();
		System.out.println();

		 System.out.println(" ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("--------------------------------");

		// ��������
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

		System.out.printf("������ �Է��ϼ���. >>");
		p4.year = sc.nextInt();
		
		System.out.printf("���� �Է��ϼ���. >>");
		p4.month = sc.nextInt();
	
		p4.st();

		LinkedList ll = new LinkedList();
		
	}

}
