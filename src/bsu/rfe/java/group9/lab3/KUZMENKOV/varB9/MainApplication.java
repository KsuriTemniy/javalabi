package bsu.rfe.java.group9.lab3.KUZMENKOV.varB9;
import javax.swing.*;

    public class MainApplication {
        public static void main(String[] args) {
            Double[] a = {1., 5., 4., 3., 2., 1.};

            HornersScheme frame = new HornersScheme(a);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        }


    }
