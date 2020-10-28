package ArrayPractice;

/*

User: khushboo
Date: 10/24/2020
Time: 4:10 PM

**/

public class QuickSort {
	public static void main(String[] args) {
		int A[] = { 10, 80, 30, 90, 40, 50, 70 };
		int length = A.length;
		QuickSort obj = new QuickSort();
		obj.sort(A, 0, length - 1);
		System.out.println("Sorted Array:");
		printArray(A);
	}

	int partition(int A[], int low, int high) {
		int pivot = A[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (A[j] < pivot) {
				i++;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			} // end if loop

		} // end for loop
		int temp = A[i + 1];
		A[i + 1] = A[high];
		A[high] = temp;
		return i + 1;
	}

	void sort(int A[], int low, int high) {
		if (low < high) {
			int pIndex = partition(A, low, high);
			sort(A, low, pIndex - 1);
			sort(A, pIndex + 1, high);
		}
	}

	// print the array
	static void printArray(int A[]) {
		int length = A.length;
		for (int i = 0; i < length; ++i) {
			System.out.print(A[i] + " ");

		}

	}

}
