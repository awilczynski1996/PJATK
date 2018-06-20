package zadanie3;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class Loader implements Runnable {
	
    private BlockingQueue<Towar> queue;
    
    public Loader(BlockingQueue<Towar> queue){
        this.queue = queue;
    }
    
	public void run() {
	       try {
	    	    File directory = new File("");
	            File file = new File(directory.getAbsolutePath() + "\\src\\Towary.txt");
	            Scanner input = new Scanner(file);
	            int counter = 1;

	            while (input.hasNextLine()) {
	            	if(counter % 200 == 0) {
	            		System.out.println("utworzono " + counter + " obiektów");
	            	}
	            	
	                String line = input.nextLine();
	                String[] test = line.split(" ");
	                
	                this.queue.put(new Towar(Integer.valueOf(test[0]), Double.parseDouble(test[1])));
	                
	                counter++;
	            }
	            
	            this.queue.put(new Towar());
	            input.close();

	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	}
}
