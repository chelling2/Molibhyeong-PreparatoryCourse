public class CountingSort {
	
    public static void countingSort(int[] array) {
    	
        // �Է� �迭�� �ִ񰪰� �ּڰ��� ���մϴ�.
        int max = findMaxValue(array);
        int min = findMinValue(array);
        
        // ��� �迭�� ũ�⸦ �����ϰ� �ʱ�ȭ�մϴ�.
        int range = max - min + 1;
        int[] count = new int[range];
        
        // �Է� �迭�� ���� ��� �迭�� ī�����մϴ�.
        for (int i = 0; i < array.length; i++) {
            count[array[i] - min]++;
        }
        
        // ���� ī��Ʈ�� ����մϴ�.
        int totalCount = 0;
        for (int i = 0; i < count.length; i++) {
            int currentCount = count[i];
            count[i] = totalCount;
            totalCount += currentCount;
        }
        
        // �Է� �迭�� ��ȸ�ϸ� ���ĵ� ����� output �迭�� �����մϴ�.
        int[] output = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            output[count[num - min]] = num;
            count[num - min]++;
        }
        
        // ���ĵ� ����� �Է� �迭�� �����մϴ�.
        for (int i = 0; i < array.length; i++) {
            array[i] = output[i];
        }
    }
    
    // �ִ� ���� ã�� 
    public static int findMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    
    // �ּڰ��� ã�� 
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
        		
        System.out.println("��� ����");
//        System.out.print("���� ��: ");
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
        
        long startTime = System.nanoTime();
        
        countingSort(array);
        
        long endTime = System.nanoTime();
        
        System.out.print("���� ��: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.print("�ɸ� �ð� : " + ((endTime - startTime)/1000) + "��");
        System.out.println();
    }
}
