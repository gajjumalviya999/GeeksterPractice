package QUEUE;

public class DynamicQueue extends Queue{

	public DynamicQueue(int cap) {
		super(cap);
		// TODO Auto-generated constructor stub
	}
    @Override
    public void enqueue(int element) throws Exception {
    	
    	if(this.size==this.data.length)
    	{
    		int oa[]=this.data;
    		this.data=new int[2*data.length];
    		for(int i=0;i<size;i++) {
    			this.data[i]=oa[(i+front)%oa.length];
    		}
    		this.front=0;
    		this.rear=oa.length-1;
    		
    	}
    	this.rear++;
    	this.rear=this.rear%this.data.length;
    	this.data[rear]=element;
    	if(this.front==-1) {
    	   this.front=0;
    	   }
    	this.size++;
    	
    }
    }

