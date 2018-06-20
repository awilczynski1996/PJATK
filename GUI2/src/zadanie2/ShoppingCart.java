package zadanie2;

import java.util.ArrayList;

public class ShoppingCart extends Container {
	
	public ShoppingCart(Customer owner) {
		this.owner = owner;
		this.ContrainerName = "Wózek";
		this.flowersInside = new ArrayList<Flower>();
	}
}
