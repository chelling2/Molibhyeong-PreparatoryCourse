
public class RadixSort {
	
    public static void radixSort(int[] arr) {
        int max = getMax(arr); // �Է� �迭���� ���� ū ���� ã���ϴ�

        // ���� ū ���� �ڸ����� �������� �ݺ������� �����մϴ�.
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp); // �� �ڸ������� �����մϴ�
        }
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        // �迭���� ���� ū ���� ã���ϴ�.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // �� �ڸ������� ������ ������ �����ݴϴ�
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // count �迭�� ������Ʈ�Ͽ� �� ���ڰ� ���ĵ� �迭������ ��ġ�� ��Ÿ���ϴ�
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // �Է� �迭�� �������� ��ȸ�ϸ� output �迭�� ���ĵ� ���ڸ� �־��ݴϴ�
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // output �迭�� arr �迭�� �����մϴ�.
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void rs(int[] k) {
        int[] arr = k;
        radixSort(arr);

        System.out.println("��� ����");
//        System.out.print("���� ��: ");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
        
        long startTime = System.nanoTime();
     long endTime = System.nanoTime();
        
        System.out.print("���� ��: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.print("�ɸ� �ð� : " + ((endTime - startTime)/1000) + "��");
        System.out.println();
    }
}
