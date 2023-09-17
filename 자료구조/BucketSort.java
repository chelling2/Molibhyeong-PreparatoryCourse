import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public static void bucketSort(float[] array, int size) {
    	
        ArrayList<Float>[] bucket = new ArrayList[size];

        // ��Ŷ �ʱ�ȭ
        for (int i = 0; i < size; i++) {
            bucket[i] = new ArrayList<Float>();
        }

        // ��Ҹ� ������ ��Ŷ�� ����
        for (int i = 0; i < size; i++) {
            bucket[(int) (size * array[i])].add(array[i]);
        }

        // ������ ��Ŷ�� ����
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
        
        System.out.println("��Ŷ ����");
//    	System.out.print("���� �� : " );
//    	for(float as : arr) {
//    		System.out.print(as + " ");
//    	}
//    	System.out.println();
    	
    	long startTime, endTime;
		startTime = System.nanoTime();

        bucketSort(arr, arr.length); // ��Ҹ� ������������ ����

        endTime = System.nanoTime();
        
        System.out.print("���� �� : " );
    	for(float as : arr) {
    		System.out.print(as + " ");
    	}
    	
    	System.out.println();
    	System.out.print("�ɸ� �ð� : " + ((endTime - startTime)/1000) + "��");
    	System.out.println();
    }
}
