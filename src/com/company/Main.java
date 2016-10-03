package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int arrayAmount = 3;
        int maxArrayNumber = 100;
	    int[][][] array = new int[arrayAmount][arrayAmount][arrayAmount];

        for (int i = 0; i <arrayAmount; i++) {
            for (int j = 0; j < arrayAmount; j++) {
                for (int k = 0; k < arrayAmount; k++) {
                    int randomNumber = random.nextInt(maxArrayNumber);

                    array[i][j][k] = randomNumber;
                }
            }
        }

        for (int i = 0; i <arrayAmount; i++) {
            for (int j = 0; j < arrayAmount; j++) {
                for (int k = 0; k < arrayAmount; k++) {
                    System.out.println( array[i][j][k] );
                }
            }
        }

    }
}
