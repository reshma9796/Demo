package com.example.demo.part1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

		
	List<Item> obj = new ArrayList<Item>();
	obj.add(new Item(1,"Shirt",200,"Allensolly"));
	obj.add(new Item(2,"Skirt",800,"H&M"));
	obj.add(new Item(3,"Jeans",2200,"Levis"));
	obj.add(new Item(4,"Saree",1500,"Garden"));
	obj.add(new Item(5,"Salwar",3500,"Ziva"));
	obj.add(new Item(6,"Chain",5500,"Tara"));
	obj.add(new Item(7,"Snacks",500,"Tacobell"));
	obj.add(new Item(8,"Bag",2200,"Dior"));
	obj.add(new Item(9,"Car",1500,"Toyota"));
	obj.add(new Item(10,"Car",3500,"Tata"));
	
	
	
	
	List < Item > obj1 = obj.stream().sorted(Comparator.comparingDouble(Item::getPrice).reversed()).collect(Collectors.toList()); //descending order

    
    System.out.println("Order by Price:"+obj1);
    
	
	 
    List<Item> names = (List<Item>) obj.stream().filter(s->s.getBrand().startsWith("Z")).toList();
    
    System.out.println("Names"+names);
	}
}
