package regularExpression;

public class Main {
    public static void main(String[] args) {
        String string = "F12abcDee";
        System.out.println(string.replaceAll("^abcDee", "YYY"));
    }
}
