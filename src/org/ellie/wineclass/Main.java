package org.ellie.wineclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.ellie.wineclass.model.Wine;

public class Main {

	public static void main(String[] args) {
		
		Wine wine1 = new Wine();
		wine1.setId(1);
		wine1.setName("w1");
		wine1.setColor(Wine.WineColor.Red);
		wine1.setType(Wine.WineType.Dry);
		wine1.setYear((short)1990);
		//System.out.println(wine1);
		
		Wine wine2 = new Wine();
		wine2.setId(2);
		wine2.setName("w2");
		wine2.setColor(Wine.WineColor.White);
		wine2.setType(Wine.WineType.Sweet);
		wine2.setYear((short)1999);
		
		Wine wine3 = new Wine();
		wine3.setId(3);
		wine3.setName("w3");
		wine3.setColor(Wine.WineColor.Red);
		wine3.setType(Wine.WineType.Sweet);
		wine3.setYear((short)2015);
		
		List<Wine> wineList = new ArrayList<>();
		wineList.add(wine1);
		wineList.add(wine2);
		wineList.add(wine3);
		
		Map<Integer, String> searchTypeMap =
				new HashMap<Integer, String>();
		searchTypeMap.put(1, "Name");
		searchTypeMap.put(2, "Type");
		searchTypeMap.put(3, "Year");
		//searchTypeMap.put(4, "Name");
		while(true) {
			
			System.out.println("Find by:");
			for (Map.Entry<Integer, String> option : searchTypeMap.entrySet()) {
				System.out.printf("%d. %s\n", option.getKey(), option.getValue());
			}
			
			Scanner scanner = new Scanner(System.in);
			Integer option = scanner.nextInt();
			
			List<Wine> wineResults = new ArrayList<>();
			
			switch (option) {
			case 1:
				String name = scanner.next();
				for (Wine wine : wineList) {
					if (wine.getName().toLowerCase().equals(name.toLowerCase())) {
						wineResults.add(wine);
					}
				}
				break;
			case 2:
				String type = scanner.next();
				for (Wine wine : wineList) {
					if (wine.getType().toString().toLowerCase().equals(type.toLowerCase())) {
						wineResults.add(wine);
					}
				}
				break;
	
			default:
				break;
			}
			
			for (Wine wine : wineResults) {
				
				System.out.println(wine);
			}
			
			System.out.println("Exit? (y/n)");
			String response = scanner.next();
			if (response.equals("y")) {
				break;
			}
		}
	}

}
