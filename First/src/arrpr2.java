import java.util.Scanner;

public class arrpr2 {
	public static void main(String[] args) {

		// ����ó�� �ο� �� �Է¹޾Ƽ� ����ϴ� ���
		int k;
		Scanner sc = new Scanner(System.in);
		System.out.println("��� �Է� ���� �ǰ���?");
		
		k=sc.nextInt();
		
		String[] name = new String[k];
		String[] scoName = new String[] { "����", "����", "����", "����" };
		int[][] score = new int[k][4]; 
		float[] avg = new float[k];
		
		
		for (k= 0; k < score.length; k++) {
			System.out.print("�̸�: ");
			name[k] = sc.next();
			
			for (int j = 0; j < score[k].length - 1; j++) {
				System.out.print(scoName[j] + " ����: ");
				score[k][j] = sc.nextInt();

				score[k][3] += score[k][j];
			}
			avg[k] = score[k][3] / name.length;
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}

		for (k = 0; k < score.length; k++) {
			System.out.println("�̸�: " + name[k]);
			for (int j = 0; j < score[k].length; j++) {
				System.out.println(scoName[j] + ": " + score[k][j]);
			}
			System.out.println("���: " + avg[k]);
			System.out.println();
		}
	}
}