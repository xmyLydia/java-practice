package regularExperssion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

//            StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
//            htmlText.append("<h2>Sub-heading</h2>");
//            htmlText.append("<p>This is a paragraph about something.</p>");
//            htmlText.append("<p>This is another paragraph about something else.</p>");
//            htmlText.append("<h2>Summary</h2>");
//            htmlText.append("<p>Here is the summary.</p>");
//
//            String h2Pattern = "<h2>";
//            Pattern pattern = Pattern.compile(h2Pattern);
//            Matcher matcher = pattern.matcher(htmlText);
//            System.out.println(matcher.matches());
//
//            matcher.reset();
//            int count = 0;
//            while(matcher.find()) {
//                count++;
//                System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
//
//            }
//
//            String h2GroupPattern = "(<h2>.*?</h2>)";
//            Pattern groupPattern = Pattern.compile(h2GroupPattern);
//            Matcher groupMatcher = groupPattern.matcher(htmlText);
//            System.out.println(groupMatcher.matches());
//            groupMatcher.reset();
//
//            while(groupMatcher.find()) {
//                System.out.println("Occurrence: " + groupMatcher.group(1));
//            }
//
//            String h2TextGroups = "(<h2>)(.+?)(</h2>)";
//            Pattern h2TextPatten = Pattern.compile(h2TextGroups);
//            Matcher h2TextMatcher = h2TextPatten.matcher(htmlText);
//
//            while(h2TextMatcher.find()) {
//                System.out.println("Occurrence: " + h2TextMatcher.group(2));
//            }
        String challenge1 = "I want a bike.";
        String regexp = "I want a \\w+."; // or I want a (bike|boat).

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("\\s", "_"));

        String challenge5 = "aaabcccdeeefffg";
        System.out.println(challenge5.matches("[abcedfg]+"));// or [a-g]+
        System.out.println(challenge5.matches("^[a]{3}bc{3}de{3}f{3}g$"));

        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[a-z]+\\.[0-9]+$"));

//        String challenge8 = "abcd.135uvqz.7tzik.999";
//        Pattern pattern8 = Pattern.compile("(.)(\\d+)(\\w)");
//        Matcher matcher8 = pattern8.matcher(challenge8);
//        while(matcher8.find()) {
//            System.out.println(matcher8.group(2));
//        }

        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern9 = Pattern.compile("(.)(\\d+)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);
        while (matcher9.find()) {
            System.out.println(matcher9.group(2));
        }
        matcher9.reset();
        while (matcher9.find()) {
            System.out.println(matcher9.start(2) + ", " + String.valueOf(matcher9.end(2) - 1));
        }

        String challenge11 = "{0,2}, {0,5}, {1,3}, {2,4}";
        Pattern pattern11 = Pattern.compile("(\\{)(.+?)([}],*)");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while (matcher11.find()) {
            System.out.println(matcher11.group(2));
        }

        String challenge12 = "11111";
        System.out.println(challenge12.matches("^[0-9]{5}$"));

        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));

        String regexp14 = "^\\d{5}(-\\d{4})?";
        System.out.println(challenge12.matches(regexp14));
        System.out.println(challenge13.matches(regexp14));
    }
}
