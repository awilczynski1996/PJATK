package zadanie3;

import java.util.concurrent.BlockingQueue;

public class WeigthAdder implements Runnable {
	
	private BlockingQueue<Towar> queue;
	private double summaryWeight;
    
    public WeigthAdder(BlockingQueue<Towar> queue){
        this.queue = queue;
    }
    
	public void run() {
        try {
            Towar towar;
            int counter = 1;
            
            while((towar = queue.take()).isLast() == false) {
            	if(counter % 100 == 0) {
            		System.out.println("policzono wage " + counter + " towarów");
            	}
            	
            	this.summaryWeight += towar.getWeigth();
            	counter++;
            }
            
            System.out.println(Double.valueOf(this.summaryWeight).longValue());
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
	}
}
