package Array;

import java.util.Comparator;

/**
 * @author mingyux
 */
public class ReverserChallenge {
    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat o1, Seat o2) {
            return o1.getNumber() - o2.getNumber();
        }
    };

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 4, 5, 7, 9};
        // Or use Array.toString(array) to print the array
        printArray(array);
        System.out.println("after reverse");
        reverse(array);
        printArray(array);
    }

    public static void reverse(int[] array) {
        if (array == null) {
            return;
        }
        int middleIndex = array.length / 2;
        int temp;
        for (int i = 0; i < middleIndex; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }
    public class Seat{
        private int number;

        public Seat(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }
}
