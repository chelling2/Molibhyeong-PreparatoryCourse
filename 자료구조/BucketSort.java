import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public static void bucketSort(float[] array, int size) {
    	
        ArrayList<Float>[] bucket = new ArrayList[size];

        // 버킷 초기화
        for (int i = 0; i < size; i++) {
            bucket[i] = new ArrayList<Float>();
        }

        // 요소를 각각의 버킷에 삽입
        for (int i = 0; i < size; i++) {
            bucket[(int) (size * array[i])].add(array[i]);
        }

        // 각각의 버킷을 정렬
        for (int i = 0; i < size; i++) {
            Collections.sort(bucket[i]);
        }

        int index = 0;
        for (int i = 0; i < size; i++) {
            while (!bucket[i].isEmpty()) {
                array[index++] = bucket[i].get(0);
                bucket[i].remove(0);
            }
        }
    }

    public static void bk() {

        float[] arr = {0.22f, 0.33f, 0.1f, 0.45f, 0.38f, 0.55f, 0.21f, 0.31f};
        
        System.out.println("버킷 정렬");
//    	System.out.print("정렬 전 : " );
//    	for(float as : arr) {
//    		System.out.print(as + " ");
//    	}
//    	System.out.println();
    	
    	long startTime, endTime;
		startTime = System.nanoTime();

        bucketSort(arr, arr.length); // 요소를 오름차순으로 정렬

        endTime = System.nanoTime();
        
        System.out.print("정렬 후 : " );
    	for(float as : arr) {
    		System.out.print(as + " ");
    	}
    	
    	System.out.println();
    	System.out.print("걸린 시간 : " + ((endTime - startTime)/1000) + "초");
    	System.out.println();
    }
}
