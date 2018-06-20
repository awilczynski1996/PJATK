package zadanie4;

public class Writer implements Runnable {
    Author author;
    
    public Writer(Author ath){
    	author = ath;
    }
 
    @Override
    public void run() {
        while(this.author.isFinished() == false){
            try {
                System.out.println(this.author.getQueue().take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }    
    }
}
