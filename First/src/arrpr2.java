import java.util.Scanner;

public class arrpr2 {
	public static void main(String[] args) {

		// 성적처리 인원 수 입력받아서 출력하는 방법
		int k;
		Scanner sc = new Scanner(System.in);
		System.out.println("몇명 입력 받을 건가요?");
		
		k=sc.nextInt();
		
		String[] name = new String[k];
		String[] scoName = new String[] { "국어", "영어", "수학", "총점" };
		int[][] score = new int[k][4]; 
		float[] avg = new float[k];
		
		
		for (k= 0; k < score.length; k++) {
			System.out.print("이름: ");
			name[k] = sc.next();
			
			for (int j = 0; j < score[k].length - 1; j++) {
				System.out.print(scoName[j] + " 점수: ");
				score[k][j] = sc.nextInt();

				score[k][3] += score[k][j];
			}
			avg[k] = score[k][3] / name.length;
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}

		for (k = 0; k < score.length; k++) {
			System.out.println("이름: " + name[k]);
			for (int j = 0; j < score[k].length; j++) {
				System.out.println(scoName[j] + ": " + score[k][j]);
			}
			System.out.println("평균: " + avg[k]);
			System.out.println();
		}
	}
}