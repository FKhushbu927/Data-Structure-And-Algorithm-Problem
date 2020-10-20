package ArrayPractice;

public class ArrayRightRotationExample {
	    public static void main(String args[]) {
		int A[]=new int [] {1,7,8,10,22};
		int k=3,last=0;
		for(int i=0;i<k;i++) {
			if(A.length>0) {
				//store the last element into last
				last=A[A.length-1];
			}
			
			for(int j=A.length-1;j>0;j--) {
				A[j]=A[j-1];
			}//end 2nd for loop
			A[0]=last;
			
		}//end 1st for loop
		System.out.println("Array after right rotation: ");    
        for(int i = 0; i< A.length; i++){    
            System.out.print(A[i] + " ");    
        } 
		
	}//end main methdo
   
   
}
