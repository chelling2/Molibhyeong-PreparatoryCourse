import java.util.*;

public class P3 {

	ArrayList<Integer> al;
	int x, y, count;

	public P3() {
		al = new ArrayList<Integer>();
	}

	public void su(int x, int y) {

		int check, count = 0;

		for (int i = x; i <= y; i++) {  // x부터 입력받은 y까지 실행할거고 

			check = 0;
			int num=i;
			
			while (num > 0) {     // 자릿수의 값을 구하기 위함. 끝의 숫자부터 리스트에 담김 
				al.add(num % 10);
				num /= 10;
			}

			for (int m = al.size() - 1; m > 0; m--) {   // 숫자의 개수 만큼 반복할거고 

				if (al.get(m) < al.get(m - 1)) {   // 오른차순 기준으로 숫자가 크면 체킹 카운트 
					check++;
				}
			}

			if (check == al.size() - 1) {  // 만일 오름차순 다 한 체킹 카운트가 맥스의 값일 시 그 숫자 출력 및 숫자 카운트 증가 
				System.out.print(i + " ");
				count++;
			}
			  al.removeAll(al);

			
		} // for문 괄호
		
		System.out.println();
		System.out.println(count +"회");  // 총 카운트 출력 

	}

	public static void good() {

		P3 a = new P3();

		Scanner sc = new Scanner(System.in);

		System.out.print("x안에 넣을 숫자를 입력하세요 : ");
		a.x = sc.nextInt();

		System.out.print("y안에 넣을 숫자를 입력하세요 : ");
		a.y = sc.nextInt();

		a.su(a.x, a.y);
	}
}
