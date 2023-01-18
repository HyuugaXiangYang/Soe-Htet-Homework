package exercise2Package;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap drinkMenu = new HashMap();
		
		drinkMenu.put("Coffee", 180);
		drinkMenu.put("Tea", 160);
		drinkMenu.put("Juice", 200);
		drinkMenu.put("Ice Cream", 220);
		
		System.out.println(drinkMenu);
		
		System.out.println(drinkMenu.keySet());
		
		System.out.println(drinkMenu.get("Coffee"));
		System.out.println(drinkMenu.get("Tea"));
		System.out.println(drinkMenu.get("Juice"));
		System.out.println(drinkMenu.get("Ice Cream"));
		
	}

}
