import java.util.*;

public class P3 {

	ArrayList<Integer> al;
	int x, y, count;

	public P3() {
		al = new ArrayList<Integer>();
	}

	public void su(int x, int y) {

		int check, count = 0;

		for (int i = x; i <= y; i++) {  // x���� �Է¹��� y���� �����ҰŰ� 

			check = 0;
			int num=i;
			
			while (num > 0) {     // �ڸ����� ���� ���ϱ� ����. ���� ���ں��� ����Ʈ�� ��� 
				al.add(num % 10);
				num /= 10;
			}

			for (int m = al.size() - 1; m > 0; m--) {   // ������ ���� ��ŭ �ݺ��ҰŰ� 

				if (al.get(m) < al.get(m - 1)) {   // �������� �������� ���ڰ� ũ�� üŷ ī��Ʈ 
					check++;
				}
			}

			if (check == al.size() - 1) {  // ���� �������� �� �� üŷ ī��Ʈ�� �ƽ��� ���� �� �� ���� ��� �� ���� ī��Ʈ ���� 
				System.out.print(i + " ");
				count++;
			}
			  al.removeAll(al);

			
		} // for�� ��ȣ
		
		System.out.println();
		System.out.println(count +"ȸ");  // �� ī��Ʈ ��� 

	}

	public static void good() {

		P3 a = new P3();

		Scanner sc = new Scanner(System.in);

		System.out.print("x�ȿ� ���� ���ڸ� �Է��ϼ��� : ");
		a.x = sc.nextInt();

		System.out.print("y�ȿ� ���� ���ڸ� �Է��ϼ��� : ");
		a.y = sc.nextInt();

		a.su(a.x, a.y);
	}
}
