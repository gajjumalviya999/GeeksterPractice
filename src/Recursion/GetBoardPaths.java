package Recursion;

import java.util.ArrayList;

class GetBoardPaths{
	public static void main(String[] args) {
		System.out.println(getboardpaths(0,10));
	}

	private static ArrayList<String> getboardpaths(int start, int end) {
		// TODO Auto-generated method stub
           if(start==end) {
			ArrayList<String> br=new ArrayList<String>();
			br.add("\n");
			return br;
		   }
           if(start>end) {
        	   	ArrayList<String> br=new ArrayList<String>();
        	    return br;
           }
           
           ArrayList<String>mr=new ArrayList<String>();
          for(int i=1;i<=6;i++) {
        	  ArrayList<String> rr=getboardpaths(start+i,end);
        	  for(String res:rr) {
        		  mr.add(i+res);
        	  }
          }
           return mr;
           
        		  
	}
}