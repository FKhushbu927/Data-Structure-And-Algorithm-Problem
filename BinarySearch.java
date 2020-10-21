/**
 *
 * @author khushboo
 */
package ArrayPractice;
public class BinarySearch {
	public static void main(String args[]) {
		int A[] = { 12, 23, 34, 45, 56, 67 };
		int n = A.length;
		int data = 34;
		BinarySearch obj = new BinarySearch();
		int result = obj.binarySearch(A, data);
		if (result == -1) {
			System.out.println("Data is not present");
		} else
			System.out.println("Data is present at " + result + " position");

	}

	int binarySearch(int A[], int data) {
		int n = A.length;
		int left = 0, right = n - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (A[mid] == data)
				return mid;
			if (A[mid] < data)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}

}
