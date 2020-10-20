package ArrayPractice;
//date 20 oct 2002
//author khushbu
public class BubbleSort {
       public static void main(String[]args) {
    	   int A[]=new int[] {12,3,1,-12,78,0};
    	   System.out.println("Array Before Sorting:");
    	   for(int i=0;i<A.length;i++) {
    		   System.out.print(A[i]+" ");
    	   }
    	   System.out.println();
    	   System.out.println("Array after sorting in ascending order:");
    	   bubbleSortAscendingOrder(A);
    	   for(int i=0;i<A.length;i++) {
    		   System.out.print(A[i]+" ");
    	   }
    	   System.out.println();
    	   System.out.println("Array after sorting in ascending order:");
    	   bubbleSortDscendingOrder(A);
    	   for(int i=0;i<A.length;i++) {
    		   System.out.print(A[i]+" ");
    	   }
    	   
       }
      static void bubbleSortAscendingOrder(int A[]) {
    	  int temp=0;
    	  int n=A.length;
    	  for(int i=0;i<n-1;i++) {
    		  for(int j=0;j<n-i-1;j++) {
    			  if(A[j]>A[j+1]) {
    				temp=A[j];
    				A[j]=A[j+1];
    				A[j+1]=temp;
    			  }
    		  } //end 2nd for loop
    		  
    	  } //end 1st for loop
      }
      ///{1,3,1,-12,78,0};
      static void bubbleSortDscendingOrder(int A[]) {
    	  int temp=0;
    	  int n=A.length;
    	  for(int i=0;i<n-1;i++) {
    		  for(int j=0;j<n-i-1;j++) {
    			  if(A[j]<A[j+1]) {
    				temp=A[j];
    				A[j]=A[j+1];
    				A[j+1]=temp;
    			  }
    		  } //end 2nd for loop
    		  
    	  } //end 1st for loop
      }
}
