
public class RadixSort {
	
    public static void radixSort(int[] arr) {
        int max = getMax(arr); // 입력 배열에서 가장 큰 수를 찾습니다

        // 가장 큰 수의 자릿수를 기준으로 반복적으로 정렬합니다.
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp); // 각 자릿수별로 정렬합니다
        }
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        // 배열에서 가장 큰 수를 찾습니다.
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

        // 각 자릿수별로 숫자의 개수를 세어줍니다
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // count 배열을 업데이트하여 각 숫자가 정렬된 배열에서의 위치를 나타냅니다
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // 입력 배열을 역순으로 순회하며 output 배열에 정렬된 숫자를 넣어줍니다
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // output 배열을 arr 배열로 복사합니다.
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void rs(int[] k) {
        int[] arr = k;
        radixSort(arr);

        System.out.println("기수 정렬");
//        System.out.print("정렬 전: ");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
        
        long startTime = System.nanoTime();
     long endTime = System.nanoTime();
        
        System.out.print("정렬 후: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.print("걸린 시간 : " + ((endTime - startTime)/1000) + "초");
        System.out.println();
    }
}
