
/*
 * 배열 Array
 * - 동일한 데이터타입을 메모리상에 순차적으로 나열한 메모리구조.
 * - 1차원배열 ~ 다차원 배열 
 */


import java.util.*;
public class arr {

	public static void main(String[] args) {

		int [] arr= new int [3];
		
		int b=1;  // 지역변수는 꼭 초기화를 해서 사용해야한다. 
		
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
