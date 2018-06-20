package zadanie4;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Author implements Runnable {
    private BlockingQueue<String> queue;
    private boolean isFinished = false;
    private String[] args;
 
    public Author(String[] args){
        this.args = args;
        
        this.queue = new ArrayBlockingQueue<String>(1024);
    }
 
    public void run() {
        for(String text : this.args){
            try {
                Thread.sleep(1000);
                this.queue.put(text);
            } catch (InterruptedException e) {
            	this.isFinished = true;
            }   
 
        }
        this.isFinished = true;
    }
    
    public boolean isFinished()
    {
    	return this.isFinished;
    }
    
    public BlockingQueue<String> getQueue()
    {
    	return this.queue;
    }
}  
