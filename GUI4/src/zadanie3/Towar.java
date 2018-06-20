package zadanie3;

public class Towar {
	private int id;
	private double weigth;
	private boolean isLast = false; 
	
	public Towar(int id, int weigth) {
		this.id = id;
		this.weigth = (double) weigth;
	}
	
	public Towar(int id, double weigth) {
		this.id = id;
		this.weigth = weigth;
	}
	
	public Towar() {
		this.isLast = true;
	}
	
	public double getWeigth() {
		return this.weigth;
	}
	
	public boolean isLast() {
		return this.isLast;
	}
}
