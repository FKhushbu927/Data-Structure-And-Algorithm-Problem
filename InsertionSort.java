package ArrayPractice;
/*
 Author :khushbu
 Date:20 Oct 2020
 **/

public class InsertionSort {
	public static void main(String args[]) {
		int A[] = new int[] { 12, 50, 1, 80, 2, -1 };
		System.out.println("Before sorting:");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		System.out.println("Ascending order");
		AsecndingOrderSort(A);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		System.out.println("Descending order:");
		DescendingOrderSort(A);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}

	static void AsecndingOrderSort(int A[]) {
		int temp = 0;
		int j;
		int n = A.length;

		for (int i = 1; i < n; i++) {
			temp = A[i];
			j = i - 1;
			while (j >= 0 && A[j] > temp) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = temp;
		}
	}

	static void DescendingOrderSort(int A[]) {
		int n = A.length;
		int temp = 0;
		int j;
		// {12,50,1,80,2,-1}
		for (int i = 1; i < n; i++) {
			temp = A[i];
			j = i - 1;
			while (j >= 0 && A[j] < temp) {
				// A[j]=A[j+1];
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = temp;
		}

	}

}
