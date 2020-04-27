package Array;

import java.util.Scanner;

/**
 * @author mingyux
 */
public class MinimumChallenge {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MinimumChallenge minimumChallenge = new MinimumChallenge();
        System.out.println("input how many integer user need to input:");
        int count = scanner.nextInt();
        int[] array = minimumChallenge.readIntegers(count);
        int minNumber = minimumChallenge.findMin(array);
        System.out.println("min number: " + minNumber);
    }

    public int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public int findMin(int[] array) {
        int temp = Integer.MAX_VALUE;
        if (array != null) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            return array[array.length - 1];
        }
        return temp;
    }
}
