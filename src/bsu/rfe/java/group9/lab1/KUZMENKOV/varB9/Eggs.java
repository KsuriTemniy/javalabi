package bsu.rfe.java.group9.lab1.KUZMENKOV.varB9;

import java.util.Map;
import java.util.HashMap;

public class Eggs extends Food {

    private String number;
    private Map<String, Integer> calories = new HashMap<>();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number.toLowerCase();
    }

        public Eggs(String number) {
        super("Яйца");
        this.number = number.toLowerCase(); 
        calories.put("одно", 70);
        calories.put("два", 140);
        calories.put("три", 210);
    }

    @Override
    public void consume() {
        System.out.println(this + " съедены");
    }

    @Override
    public int calculateCalories() {
        if (!calories.containsKey(number)) {
            System.out.println("Неизвестное количество яиц");
            return -1;
        }
        return calories.get(number);
    }

    @Override
    public String toString() {
        return super.toString() + " количеством '" + number.toUpperCase() + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            if (!(obj instanceof Eggs)) return false;
            return number.equals(((Eggs) obj).number);
        } else {
            return false;
        }
    }
}
