package zadanie3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

  public static void main(String[] args) {
	  BlockingQueue<Towar> queue = new ArrayBlockingQueue<>(1000);
	  Loader loader = new Loader(queue);
	  WeigthAdder weigthAdder = new WeigthAdder(queue);
	  
	  new Thread(loader).start();
	  new Thread(weigthAdder).start();
  }
}
