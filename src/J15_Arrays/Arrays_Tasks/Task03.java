package J15_Arrays.Arrays_Tasks;

import java.util.Arrays;

public class Task03 {
	
	public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
       output [2, 3, 1]
        */

		int arr[]={1,2,3};

		int yeniarr[] = new int[arr.length];

		for (int i = 0; i <= arr.length-1; i++) {

			if (i==0){
				yeniarr[i]=arr[i+1];
			}else if (i==arr.length-1) {
				yeniarr[i] = arr[0];
			}else yeniarr[i] = arr[i+1];
		}
		System.out.println("yeni array : "+ Arrays.toString(yeniarr));



	}

}
