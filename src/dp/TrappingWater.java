package dp;
class TrappingWater{
	public static void main(String[] args) {
	   int [] heights= {2,0,2,4,1,2,3,2,4,5};
	   System.out.println(trappingwater(heights));
	   }
	public static int trappingwater(int [] heights) {
		int water=0,minvalue=0;
		int size=heights.length;
		int [] lmax=new int[size];
		int [] rmax= new int[size];
		lmax[0]=heights[0];
		rmax[size-1]=heights[size-1];
		for(int i=1;i<size;i++) {
			lmax[i] =Math.max(lmax[i-1], heights[i]);
		}
		for(int i=size-2;i>=0;i--) {
			rmax[i] =Math.max(rmax[i+1], heights[i]);
		}
		for(int i=0;i<size;i++) {
			minvalue=Math.min(lmax[i], rmax[i]);
			if(minvalue>heights[i])
				water+= minvalue-heights[i];
		}
		return water;
	}
}