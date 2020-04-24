package Array;

import java.util.Scanner;

public class Main {
    private int[] array = new int[5];

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] array = main.getIntegers();

        main.printArray();
        main.sortArray(array);
        main.printArray();
    }

    public void printArray() {
        for (int item : getArray()) {
            System.out.println(item);
        }
    }

    public int[] getIntegers() {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int input = sc.nextInt();
            array[i] = input;
        }
        return array;
    }

    public void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
