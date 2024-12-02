package bsu.rfe.java.group9.lab1.KUZMENKOV.varB9;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        Food[] breakfast = new Food[20];

        breakfast[0] = new Apple("маленькое");
        breakfast[1] = new Cheese();
        breakfast[2] = new Eggs("два");
        breakfast[3] = new Eggs("два");
        breakfast[4] = new Eggs("три");
        breakfast[5] = new Cheese();
        breakfast[6] = new Apple("среднее");
        
        if (args.length > 0) {
            if (args[0].equals("-calories")) {
                int totalCalories = calculateTotalCalories(breakfast);
                System.out.println("Общая калорийность завтрака: " + totalCalories);
            } else if (args[0].equals("-sort")) {
                Arrays.sort(breakfast, new FoodComparator().reversed());
                System.out.println("Завтрак отсортирован по имени в обратном порядке:");
            } else if (args[0].startsWith("-count")) {
                String foodType = args[1];
                int count = countFoodType(breakfast, foodType);
                System.out.println("Количество " + foodType + " в завтраке: " + count);
            }
        }

        for (Food food : breakfast) {
            if (food != null) {
                System.out.println(food);
            }
        }
    }

    public static int countFoodType(Food[] breakfast, String foodType) {
        int count = 0;
        for (Food food : breakfast) {
            if (food != null && food.getClass().getSimpleName().equals(foodType)) {
                count++;
            }
        }
        return count;
    }

    public static int calculateTotalCalories(Food[] breakfast) {
        int total = 0;
        for (Food food : breakfast) {
            if (food != null) {
                total += food.calculateCalories();
            }
        }
        return total;
    }
}
