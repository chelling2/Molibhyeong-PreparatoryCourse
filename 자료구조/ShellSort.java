public class ShellSort {
	
  
    // gap��ŭ ������ ��ҵ��� ���� ����
    // ������ ������ first���� last����
    public static void Sort(int[] list, int first, int last, int gap) {
    	
        int i, j, key;

        i = first + gap;   // ���� ���ҿ��� ���� ��ŭ ������ �ε��� 
        while (i <= last) {
            key = list[i]; // ���� ���Ե� ������ i��° ������ key ������ ����

            j = i - gap;    //���� ���� �ε���
            
            while (j >= first && list[j] > key) {
                list[j + gap] = list[j]; // ���ڵ带 gap��ŭ ���������� �̵�
                j = j - gap;
            }

            list[j + gap] = key;  //���� ����Ű�� ���ڿ� Ű�� ���� 
            i = i + gap;
        }
    }

    // �� ����
    public static void shellSort(int[] list, int n) {
    	
        int i, gap;

        for (gap = n / 2; gap > 0; gap = gap / 2) {
            if ((gap % 2) == 0) {
                gap++; // gap�� Ȧ���� �����.
            }

            // �κ� ����Ʈ�� ������ gap�� ����.
            for (i = 0; i < gap; i++) {
                // �κ� ����Ʈ�� ���� ���� ���� ����
                Sort(list, i, n - 1, gap);
            }
        }
    }

    public static void ss(int[] vb) {
    	
        int[] list = vb;


		System.out.println("�� ����");
//    	System.out.print("���� �� : " );
//    	for(int as : list) {
//    		System.out.print(as + " ");
//    	}
//    	System.out.println();
        
    	long startTime, endTime;
		startTime = System.nanoTime();
		
        shellSort(list, list.length);

        endTime = System.nanoTime();
        
        System.out.print("���� �� : " );
    	for(int as : list) {
    		System.out.print(as + " ");
    	}
    	
    	System.out.println();
    	System.out.print("�ɸ� �ð� : " + ((endTime - startTime)/1000) + "��");
    	System.out.println();
    }
}
