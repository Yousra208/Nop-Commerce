package utility;

import java.util.Random;

public class Utilities {
    public static int generateRandomInteger(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("The minimum value must be less than or equal to the maximum value.");
        }
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        int randomInteger = generateRandomInteger(10, 20);
        System.out.println("The random integer is: " + randomInteger);
    }
}
