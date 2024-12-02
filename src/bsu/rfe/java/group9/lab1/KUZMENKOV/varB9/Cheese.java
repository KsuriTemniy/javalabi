package bsu.rfe.java.group9.lab1.KUZMENKOV.varB9;

public class Cheese extends Food {
	
	private int calories = 300;
	public Cheese() {
		super("Сыр");
	}
	public void consume() {
		System.out.println(this + " съеден");
	}
	public int calculateCalories() {
		return calories;
	}
}

