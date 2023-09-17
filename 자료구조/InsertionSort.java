
public class InsertionSort {

	public static void is(int[] ar) {
		
		int i, j, temp;
		int[] array = ar;

		System.out.println("삽입 정렬");
//		System.out.print("정렬 전 : " );
//    	for(int as : array) {
//    		System.out.print(as + " ");
//    	}
    	
//    	System.out.println();
    	
    	long startTime, endTime;
		startTime = System.nanoTime();
    	
		for (i = 0; i < array.length-1; i++) {   
			j = i;
			while (array[j] > array[j + 1]) {
				temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
				j--;
			}
		}
		
		endTime = System.nanoTime();
		
		System.out.print("정렬 후 : " );
		for(int as : array) {
    		System.out.print(as + " ");
    	}

		System.out.println();
		System.out.print("걸린 시간 : " + ((endTime - startTime)/1000) + "초");
		System.out.println();
	}

}
