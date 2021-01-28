package Recursion;

import java.util.ArrayList;

class GetMazePaths{
	public static void main(String[] args) {
		System.out.println(getmazepaths(0,0,2,2));
		System.out.println(getmazepathmultiple(0,0,2,2));
	}

	private static ArrayList<String> getmazepathmultiple(int cr, int cc, int er , int ec) {
		// base case
		if(cr==er&&cc==ec) {
			ArrayList<String> br =new ArrayList<>();
			br.add("\n");
			return br;
		}
		if(cr>er || cc>ec) 
		{
			ArrayList<String> br =new ArrayList<>();
			return br;
		}
		ArrayList<String> mr=new ArrayList<>();
		int move=1;
		while(move<=ec)
		{
			
		ArrayList <String> rrh= getmazepathmultiple(cr,cc+move,er,ec);
		for(String rr : rrh) 
			mr.add("H"+ move+rr);
		move++;
		
		}
		
		move=1;
		while(move<=er)
		{
		ArrayList <String> rrv= getmazepathmultiple(cr+move,cc,er,ec);
		for(String rr : rrv)
			mr.add("V"+move+rr);
		move++;
		}
		
		move=1;
		while(move<=ec && move<=er)
		{
		ArrayList<String>rrd=getmazepathmultiple(cr+move,cc+move,er,ec);
		for(String rr: rrd)
			mr.add("D"+move+rr);
		move++;
		}
		
		return mr;
		
		
	}

	private static ArrayList<String> getmazepaths(int cr, int cc, int er , int ec) {
		// Base Condition
		if(cr==er&&cc==ec) {
			ArrayList<String> br =new ArrayList<>();
			br.add("\n");
			return br;
		}
		if(cr>er || cc>ec) 
		{
			ArrayList<String> br =new ArrayList<>();
			return br;
		}
		ArrayList<String> mr=new ArrayList<>();
		
		
		ArrayList <String> rrh= getmazepaths(cr,cc+1,er,ec);
		for(String rr : rrh) 
			mr.add("H"+rr);
	
		ArrayList <String> rrv= getmazepaths(cr+1,cc,er,ec);
		for(String rr : rrv)
			mr.add("V"+rr);
	
		
		ArrayList<String>rrd=getmazepaths(cr+1,cc+1,er,ec);
		for(String rr: rrd)
			mr.add("D"+rr);
		return mr;
		
	}
}