
/*
 * �迭 Array
 * - ������ ������Ÿ���� �޸𸮻� ���������� ������ �޸𸮱���.
 * - 1�����迭 ~ ������ �迭 
 */


import java.util.*;
public class arr {

	public static void main(String[] args) {

		int [] arr= new int [3];
		
		int b=1;  // ���������� �� �ʱ�ȭ�� �ؼ� ����ؾ��Ѵ�. 
		
		System.out.println(b);
		
		System.out.println();
		
		for(int i =0; i<arr.length; i++)  
			System.out.println(arr[i]);
		
		System.out.println();
		
		int [][]arr2= new int[2][];
		
		
		arr2[0] = new int[3];
		arr2[1] = new int[5];
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++)
				System.out.println(arr2[i][j]);
		}
		
	}

}
