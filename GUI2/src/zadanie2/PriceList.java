package zadanie2;

import java.util.*;

public class PriceList {
	private static PriceList instance = null;
	private Map<String, Double> flowerMap = new HashMap<String, Double>();
	
	private PriceList() {
		
	}
	
	public static PriceList getInstance() {
		if(instance == null) {
			instance = new PriceList();
		}
		
		return instance;
	}
	
	public void put(String flowerName, double price) {
		this.flowerMap.put(flowerName, price);
	}
	
	public double getPrice(Flower flower) throws Exception {
		String name = flower.getName();
		
		if(this.flowerMap.containsKey(name) == false) {
			throw new Exception("Missing Flower");
		}
		
		return this.flowerMap.get(name);
	}
}
