package lambdaChallenge;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };
        Runnable runnable1 = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        Function<String, String> lambdaFunction = (String s) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };
        //String output = lambdaFunction.apply("1234567890");
        System.out.println(everySecondChar(lambdaFunction, "1234567890"));
    }

//    public static String everySecondChar(String source) {
//        StringBuilder returnVal = new StringBuilder();
//        for (int i = 0; i < source.length(); i++) {
//            if (i % 2 == 1) {
//                returnVal.append(source.charAt(i));
//            }
//        }
//        return returnVal.toString();

    //    }
    public static String everySecondChar(Function<String, String> lambdaFunction, String input) {
        return lambdaFunction.apply(input);
    }

}
