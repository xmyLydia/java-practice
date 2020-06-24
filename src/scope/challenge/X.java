package scope.challenge;

import java.util.Scanner;

/**
 * @author mingyux
 */
public class X {
    private final Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        X x = new X();
        System.out.println("please input a number: ");
        x.x(x.x.nextInt());
    }

    private void x(int x) {
        while (x > 0) {
            System.out.println("time table: " + x);
            x--;
        }
    }
}
