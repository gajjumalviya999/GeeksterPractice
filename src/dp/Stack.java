package dp;

public class Stack {
final int max=1000;
int a[]=new int[max];
int top;
Stack()              //constructor
{ System.out.println("Stack created ");
	top=-1;
	
}
public void push(int item)
	{
	if(top<max) {
		top+=1;
		a[top]=item;
		System.out.println("item inserted and now stack is as ..");
		printstack();
		
		
	}
	else
		System.out.println("full Stack no more item can be added");
	
	}
public void pop()
{ 
	if(top>-1) {
		System.out.println("poped item is " +a[top] + " at index " + top);
		top-=1;	
		System.out.println(" and now the stack is as ..");
		printstack();
	}
	else
		System.out.println("empty stack cant pop");
	
}
public void printstack()
{   System.out.println("Stack .....");
   	if(top>-1)
	for(int i=top;i>-1;i--)
		System.out.println(a[i]);
	else
		System.out.println("empty stack ");
}
}
