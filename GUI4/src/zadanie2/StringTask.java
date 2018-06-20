package zadanie2;

public class StringTask implements Runnable {
	private String baseString;
	private int copiesNumber;
	private String result;
	volatile TaskState state;
	private boolean isDone;
	private Thread calcThread;
	
	public StringTask(String baseString, int copiesNumber) {
		this.baseString = baseString;
		this.copiesNumber = copiesNumber;
		this.result = "";
		
		this.isDone = false;
		this.state = TaskState.CREATED;
	}
	
	@Override
	public void run() {
		this.state = TaskState.RUNNING;
		
		synchronized(this.result){
		    try {
		        for(int i = 0; i < this.copiesNumber; i++) {
		            result += this.baseString; 
		        }
		        
		        this.isDone = true;
		        this.state = TaskState.READY;
		    }
	        catch(Exception e) {
	            this.state = TaskState.ABORTED;
	        }
	    }
	}
	
	public String getResult() {
		return this.result;
	}
	
	public TaskState getState() {
		return this.state;
	}
	
	public void start() {
		this.calcThread = new Thread(this);
		this.calcThread.start();
	}
	
	public void abort() {
		this.state = TaskState.ABORTED;	
		this.calcThread.interrupt();
	}
	
	public boolean isDone() {
		return this.isDone || this.calcThread.isInterrupted();
	}
}
