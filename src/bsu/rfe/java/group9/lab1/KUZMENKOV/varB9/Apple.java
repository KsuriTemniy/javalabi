package bsu.rfe.java.group9.lab1.KUZMENKOV.varB9;

import java.util.Map;
import java.util.HashMap;
public class Apple extends Food {
	
	private String size;
	private Map<String, Integer> calories = new HashMap<>();
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size.toLowerCase();
	}

	public Apple(String size) {
		super("Яблоко");
		this.size = size.toLowerCase();
		calories.put("маленькое", 100);
		calories.put("среднее", 200);
		calories.put("большое", 300);
	}

	@Override
	public void consume() {
		System.out.println(this+" съедено");
	}
	
	@Override
	public int calculateCalories() {
		if (!(calories.containsKey(size))) {
			System.out.println("Неизвестный размер яблока");
			return -1;
		}
		return calories.get(size);
	}
	
	@Override
	public String toString() {
		return super.toString() + " размера '" + size.toUpperCase() +"'";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			if (!(obj instanceof Apple)) return false;
			return size.equals(((Apple)obj).size);
		} else
			return false;
	}
}
