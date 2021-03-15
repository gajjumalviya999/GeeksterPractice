package LinkedListpkg;

import java.util.ArrayList;
import java.util.List;

class firstnonRepeatingcharacter{
	public static void main(String[] args) {
		//contains only lower case alphabets
		String stream="geeksforgeeksaannddgeeksqqxfor";
		System.out.println(FirstnonRepeatingcharacter(stream));
		
	}

	private static char FirstnonRepeatingcharacter(String stream) {
		// TODO Auto-generated method stub
		List <Character> nonRepeat=new ArrayList<Character>();
		boolean repeat[]=new boolean[26];
		System.out.println(repeat[0]);
		for(int i=0;i<stream.length();i++) {
			char ch=stream.charAt(i);
			if(repeat[(int)ch-97]==false) {
				if(!nonRepeat.contains(ch)) {
					nonRepeat.add(ch);	
				}
				else
				{
					nonRepeat.remove((Character)ch);
					repeat[(int)ch-97]=true;
				}
			}
		}
		if(nonRepeat.size()>0) {
			return nonRepeat.get(0);
		}
		else 
			return '\0'; 
	}
}
