
public class BubbleSort {

	public static void bst(int[] c) {

		int[] array = c;
		int i, j, temp;
		

		System.out.println("버블 정렬");
//		System.out.print("정렬 전 : " );
//    	for(int as : array) {
//    		System.out.print(as + " ");
//    	}
    	
//    	System.out.println();
		
    	long startTime, endTime;
		startTime = System.nanoTime();
		
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array.length - (i+1); j++) {  
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
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
