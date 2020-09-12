package lambdaChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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
        System.out.println(everySecondChar(lambdaFunction, "1234567890"));

        Supplier<String> iLoveJava = () -> "I love Java";
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
//        List<String> firstUpperCaseList = new ArrayList<>();
//        topNames2015.forEach(name -> firstUpperCaseList.add(name.substring(0, 1).toUpperCase()
//                        .concat(name.substring(1, name.length()))
//                )
//        );
//        firstUpperCaseList.sort(String::compareTo);
//        firstUpperCaseList.forEach(System.out::println);

//        Long count = topNames2015
//                .stream()
//                .map(s -> s.substring(0, 1).toUpperCase().concat(s.substring(1, s.length())))
//                .sorted(String::compareTo)
//                .filter(s -> s.charAt(0) == 'A')
//                .count();
//        System.out.println("A:" + count);

        List<String> updatedList = topNames2015
                .stream()
                .map(s -> s.substring(0, 1).toUpperCase().concat(s.substring(1, s.length())))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }

    public static String everySecondChar(Function<String, String> lambdaFunction, String input) {
        return lambdaFunction.apply(input);
    }
}
