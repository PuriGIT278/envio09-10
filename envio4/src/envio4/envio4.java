package envio4;

import java.util.Arrays;

public class envio4 {
	public static int[] merge(int[] arr1, int[] arr2) { 
		int[] res = new int[arr1.length+arr2.length]; //llamo pos1 a la posicion del 1 y la pos2 a la del 2
		int pos1 = 0;
		int pos2 = 0;
		int posRes = 0;
		
		while (pos1<arr1.length && pos2<arr2.length) {
			
			if (arr1[pos1] <= arr2[pos2]) {
				res[posRes] = arr1[pos1];
				pos1++;
				posRes++;
			} else { // (arr1[pos1] > arr2[pos2]) también vale
				res[posRes] = arr2[pos2];
				pos2++;
				posRes++;
			}
			
		}
		
		//Solo falta 1 por recorrer la primera si es del uno, la segunda si es del 2
		
		while(pos1 < arr1.length) {
			res[posRes] = arr1[pos1];
			pos1++;
			posRes++;
		}
		
		while(pos2 < arr2.length) {
			res[posRes] = arr2[pos2];
			pos2++;
			posRes++;
		}
		
		//res está lleno ya
		
		return res;
		
	}
	public static void main(String[] args) {
		 System.out.println(Arrays.toString(merge(new int[] {1,3,6,8}, new int[] {2,4,5,7})));
	 }
}
