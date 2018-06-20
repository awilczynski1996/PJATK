package zadanie2;

import java.util.ArrayList;

public class Box extends Container {
	public Box(Customer owner) {
		this.owner = owner;
		this.ContrainerName = "Pudełko";
		this.flowersInside = new ArrayList<Flower>();
	}
}
