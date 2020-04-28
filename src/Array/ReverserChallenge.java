package Array;

/**
 * @author mingyux
 */
public class ReverserChallenge {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 4, 5, 7, 9};
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
}
