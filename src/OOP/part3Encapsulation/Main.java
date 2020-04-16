package OOP.part3Encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(0.5, 0, true);
        printer.fillUpToner(0.5);
        printer.printPage(3);
    }
}
