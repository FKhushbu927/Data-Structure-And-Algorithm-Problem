package ArrayPractice;

import java.util.Arrays;

public class ArrayLeftRotation {
	public static void main(String[] args) {
		int A[] = new int[] { 5, 6, 7, 8, 9 };
		int k = 2, first = 0;
		  System.out.println("Original array: " + Arrays.toString(A));
		for (int i = 0; i < k; i++) {
			if (A.length > 0) {
				first = A[A.length - A.length];
			}
			for (int j = A.length - A.length; j < A.length - 1; j++) {
				A[j] = A[j+1];
			} // end 2nd for loop

			A[A.length - 1] = first;
		}
		
		for(int i=0;i<A.length;i++) {
			System.out.println(	" "+A[i]);
		}

	}

}
