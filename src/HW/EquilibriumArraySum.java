package HW;
class EquilibriumArraySum{
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		equilibriumarraysum(arr);
		
	}

	private static void equilibriumarraysum(int[] arr) {
		// TODO Auto-generated method stub
		int sumleft=0;
		int sumright=0;
		int i=0;
		for(i=0;i<arr.length;i++) {
			sumleft=0;
			sumright=0;
			for(int j=0;j<i;j++)
				sumleft+=arr[j];
			for(int k=i+1;k<arr.length;k++)
				sumright+=arr[k];
			if(sumleft==sumright) {
				System.out.println("equilibrium at index : " + i);
				break;
			}
	      if(i==arr.length)
	    	  System.out.println(" NO equilibrium point");
		}
	}
}