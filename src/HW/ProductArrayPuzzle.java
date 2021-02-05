package HW;
class ProductArrayPuzzle{
	public static void main(String[] args) {
		int arr[]= {10, 3, 5, 6, 2};
		int Ans[]=productArrayPuzzle(arr);
		for(int element:Ans)
			System.out.println(element);
	}

	private static int[] productArrayPuzzle(int[] arr) {
		// TODO Auto-generated method stub
		int prodArray[]=new int[arr.length];
		for (int i = 0; i < prodArray.length; i++) {
			 prodArray[i]=1;
		
		}
		int temp=1;
		 for (int i = 0; i < arr.length; i++) { 
	            prodArray[i] = temp; 
	            temp *= arr[i]; 
	        } 
	  
	        
	        temp = 1; 
	  
	       
	        for (int i = arr.length - 1; i >= 0; i--) { 
	            prodArray[i] *= temp; 
	            temp *= arr[i]; 
	        }
		return prodArray;
	}
}