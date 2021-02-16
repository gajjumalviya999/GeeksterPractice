package stack;

import java.util.ArrayList;

public class Stack<T> {
 ArrayList<T> stack=new  ArrayList<T>();
 
public int Size() {
	return this.stack.size();
} 
public void push(T element) {
	int top=this.Size();
	stack.add(top, element);
}
public T pop() {
	if(!stack.isEmpty()) {T element;
	element=stack.get(stack.size()-1);
	stack.remove(stack.size()-1);
	return element;
	}
	else
		return null;
}
public T peek() {
	if(!stack.isEmpty())
	return stack.get(stack.size()-1);
	else
		System.out.print("empty stack  ");
	return null;
}
public void show() {
	if(!stack.isEmpty())
		for(int i=stack.size()-1;i>=0;i--) {
		System.out.println(stack.get(i));
	}
	else
		System.out.println("Stack is empty");
	return;
}
public boolean isEmpty() {
	return stack.isEmpty();
}
}