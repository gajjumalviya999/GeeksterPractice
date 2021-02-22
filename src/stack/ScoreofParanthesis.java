package stack;

public class ScoreofParanthesis {

	public static void main(String[] args) {
 System.out.println(scorecheck("(()(()))"));
	}

	private static int  scorecheck(String string) {
		// TODO Auto-generated method stub
		Stack <Integer> scorestate=new Stack<>();
		
		for(int i=0; i<string.length();i++) {
			char ch=string.charAt(i);
			if(ch=='(') {
				scorestate.push(-1);
			}
			else {
				if(scorestate.peek()==-1) {
					scorestate.pop();
					scorestate.push(1);
				}
				else {
					int currentscore=0;
					while(scorestate.peek()!=-1) {
						currentscore+=scorestate.pop();
					}
					currentscore=currentscore*2;
					scorestate.pop();
					scorestate.push(currentscore);
				}
			}
		}
		int score=0;
		while(!scorestate.isEmpty()) {
			score+=scorestate.pop();
		}
		return score;
	}

}
