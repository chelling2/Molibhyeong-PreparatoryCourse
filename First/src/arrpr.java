import java.util.Scanner;

public class arrpr {
	public static void main(String[] args) {

		// 3�� ����ó�� �Է� 

	
		String[] name = new String[3];
		String[] scoName = new String[] { "����", "����", "����", "����" };
		int[][] score = new int[3][4]; 
		float[] avg = new float[3];
		
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < score.length; i++) {
			System.out.print("�̸�: ");
			name[i] = sc.next();
			
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.print(scoName[j] + " ����: ");
				score[i][j] = sc.nextInt();

				score[i][3] += score[i][j];
			}
			avg[i] = score[i][3] / 3.f;
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}

		for (int k = 0; k < score.length; k++) {
			System.out.println("�̸�: " + name[k]);
			for (int j = 0; j < score[k].length; j++) {
				System.out.println(scoName[j] + ": " + score[k][j]);
			}
			System.out.println("���: " + avg[k]);
			System.out.println();
		}
	}
}