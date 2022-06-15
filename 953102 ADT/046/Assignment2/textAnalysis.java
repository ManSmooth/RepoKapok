package Assignment2;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class textAnalysis {
    public static void main(String[] args) {
        int count = 0, count2 = 0;
        if (args.length < 1) {
            System.out.printf("Missing Input file.\ntextAnalysis.java [text input] ?[-d:details]");
            return;
        }
        long start = System.nanoTime();
        List<String> words = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(
                        args[0])))) {
            //
            // More accurate word finding than just splitting by delims
            //
            Pattern p = Pattern.compile("[-\\w':.]+[\\w:]+|%[\\w.:]+%|[\\w]+");
            String in;
            while ((in = br.readLine()) != null) {
                Matcher matcher = p.matcher(in);
                while (matcher.find()) {
                    words.add(matcher.group());
                    count += matcher.group().length();
                }
                count2++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }   
        System.out.printf("Total Char count: %d\n", count);
        System.out.printf("Total Palindrome count: %d\n", words.stream().filter(s -> isPalindrome(s)).count());
        if (args[args.length > 1 ? 1 : 0].equals("-d")) {
            System.out.println(words.stream().filter(s -> isPalindrome(s)).toList());
        }
        System.out.printf("Total Token count: %d\n", words.size());
        if (args[args.length > 1 ? 1 : 0].equals("-d")) {
            System.out.println(words);
        }
        System.out.printf("Total new line: %d\n", count2);
        System.out.printf("The longest token: %s\n", words.stream().max(Comparator.comparing(String::length)).get());
        System.out.printf("The average length of token: %.3f\n", words.stream().mapToInt(String::length).average().getAsDouble());
        System.out.printf("Total time to execute this program: %.3f miliseconds\n", (System.nanoTime() - start) / 1000000.0);
        System.out.println("Terminated Properly.");
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll(" ", "");
        return s.equals(new StringBuilder().append(s).reverse().toString());
    }
}
