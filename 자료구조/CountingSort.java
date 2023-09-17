public class CountingSort {
	
    public static void countingSort(int[] array) {
    	
        // 입력 배열의 최댓값과 최솟값을 구합니다.
        int max = findMaxValue(array);
        int min = findMinValue(array);
        
        // 계수 배열의 크기를 결정하고 초기화합니다.
        int range = max - min + 1;
        int[] count = new int[range];
        
        // 입력 배열의 값을 계수 배열에 카운팅합니다.
        for (int i = 0; i < array.length; i++) {
            count[array[i] - min]++;
        }
        
        // 누적 카운트를 계산합니다.
        int totalCount = 0;
        for (int i = 0; i < count.length; i++) {
            int currentCount = count[i];
            count[i] = totalCount;
            totalCount += currentCount;
        }
        
        // 입력 배열을 순회하며 정렬된 결과를 output 배열에 저장합니다.
        int[] output = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            output[count[num - min]] = num;
            count[num - min]++;
        }
        
        // 정렬된 결과를 입력 배열에 복사합니다.
        for (int i = 0; i < array.length; i++) {
            array[i] = output[i];
        }
    }
    
    // 최대 값을 찾음 
    public static int findMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    
    // 최솟값을 찾음 
    public static int findMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
    
    public static void cs(int[] p) {
        int[] array =p; 
        		
        System.out.println("계수 정렬");
//        System.out.print("정렬 전: ");
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
        
        long startTime = System.nanoTime();
        
        countingSort(array);
        
        long endTime = System.nanoTime();
        
        System.out.print("정렬 후: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.print("걸린 시간 : " + ((endTime - startTime)/1000) + "초");
        System.out.println();
    }
}
