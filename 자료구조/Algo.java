import java.util.Scanner;

public class Algo {

	public static int[] array;
	
	public Algo()
	{
		array= new int[10002];
		for(int i=0; i<array.length; i++) {
			array[i]= (int)(Math.random()*100)+1; //1부터 100까지 
		}
		
	}
	
	public static void main(String[] args) {
		
		Algo algo = new Algo();
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1.선택 2.버블 3.삽입 4.병합 5.퀵 6.힙 7.셸 8.계수 9.기수 10.버킷 11.종료");
			switch (sc.nextInt()) {

			case 1:
				SelectionSort.sts(array);
				break;
			case 2:
				BubbleSort.bst(array);
				break;
			case 3:
				InsertionSort.is(array);
				break;
			case 4:
				MergeSort.ms(array);
			case 5:
				QuickSort.qs(array);
				break;
			case 6:
				HeapSort.hs(array);
				break;
			case 7:
				ShellSort.ss(array);
				break;
			case 8:
				CountingSort.cs(array);
				break;
			case 9:
				RadixSort.rs(array);
				break;
			case 10:
				BucketSort.bk();
				break;
			case 11:
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("잘못 입력하였습니다");
				continue;

			}
		}

	}

}
