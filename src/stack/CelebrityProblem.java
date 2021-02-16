package stack;

public class CelebrityProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int celebarray[][]= {{0,0,1,0},
							 {0,0,1,0},
							 {0,0,0,0},
							 {0,0,1,0}};
		int celebrity=findceleb(celebarray);
		if(celebrity!=-1) {
			System.out.println("Celebbrity is  "+celebrity);
		}
		else
			System.out.println("Not Found ");
	}

	private static int findceleb(int[][] celebarray) {
		// TODO Auto-generated method stub
		
		 Stack<Integer> celebstack=new Stack<>();
		 for(int i=0;i<celebarray.length;i++){
			 celebstack.push(i);
		 }
		 
		 while(celebstack.Size()>1) {
			 int a=celebstack.pop();
			 int b=celebstack.pop();
			 if(celebarray[a][b]==1) 
				 celebstack.push(b);
			  else
				 celebstack.push(a);
			 
		 }
		int  currceleb=celebstack.pop();
		
		 for(int i=0;i<celebarray.length;i++) {
			 if(i!=currceleb)
			 if(celebarray[currceleb][i]==1||celebarray[i][currceleb]==0)
				 return -1;
		 }
		return currceleb;
	}
	

}
