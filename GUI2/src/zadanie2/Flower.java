package zadanie2;

abstract public class Flower {
	protected int quantity;
	protected String colour;
	protected String name;
	
	public String getName()
	{
		return this.name;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public int getQuantity()
	{
		return this.quantity;
	}
}
