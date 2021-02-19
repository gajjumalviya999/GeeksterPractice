package QUEUE;

public class Queue {
int [] data ;
int front;
int rear;
int size;

public Queue(int cap) {
	data=new int[cap];
	this.front =-1;
	this.rear=-1;
	
}

public void enqueue(int element) throws Exception {
	
	if(this.size==this.data.length)
		throw new Exception("Queue is full");
	if(this.front==-1) {
		this.front=0;
		this.rear=0;
		this.data[rear]=element;
		this.size=1;
	}
	else {this.rear++;
			this.rear=this.rear%this.data.length;
		  this.data[rear]=element;
		
		this.size++;
	}
}
public int dequeue() throws Exception {
	int element=0;
	if(this.size==0)
		throw new Exception("Queue is empty");
	element=data[front];
	 front++;
	 this.front=this.front%this.data.length;
	this.size--;
	return element;
}
public int getfront() throws Exception
{
	if(this.size==0) 
		throw new Exception("Queue is empty");
		return this.data[front];
		
}
public int getrear() throws Exception
{
	if(this.size==0) 
		throw new Exception("Queue is empty");
		return this.data[rear];
		
}
public int getsize() {
  return this.size;
}
public void display() {
	for(int i=0;i<size;i++) {
		System.out.print(this.data[(i+front)%this.data.length]+ "\t");
	}
}
}