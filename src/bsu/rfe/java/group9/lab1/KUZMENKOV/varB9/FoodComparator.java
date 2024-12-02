package bsu.rfe.java.group9.lab1.KUZMENKOV.varB9;

import java.util.Comparator;

class FoodComparator implements Comparator<Food> {
 @Override
 public int compare(Food arg0, Food arg1) {
     if (arg0 == null) return 1; 
     if (arg1 == null) return -1; 

     int nameComparison = arg1.getName().compareTo(arg0.getName());
     if (nameComparison != 0) {
         return nameComparison; 
     }

     if (arg0 instanceof Cheese) {
         return 1; 
     }
     if (arg1 instanceof Cheese) {
         return -1; 
     }

     if (arg0 instanceof Apple && arg1 instanceof Apple) {
         return ((Apple) arg0).getSize().compareTo(((Apple) arg1).getSize());
     }

     if (arg0 instanceof Eggs && arg1 instanceof Eggs) {
         return ((Eggs) arg0).getNumber().compareTo(((Eggs) arg1).getNumber());
     }

     return 0; 
 }
}
