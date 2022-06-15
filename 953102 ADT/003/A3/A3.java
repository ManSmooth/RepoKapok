//642115003 Kan Katpark

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class A3 {

    public static void main(String[] args) {
        Vector<String> questions = new Vector<>();
        File file = new File(args[0]);

        readInput(questions, file);

        System.out.printf("%-26s | %-10s\n\n", "Infix", "Postfix");
        for (String question : questions) {
            String postfix = infixToPostfix(question);
            System.out.printf("%-26s | %-10s\n", question, postfix);
        }

    } // end main method

    // Pre: String of expresstion
    // Post: return postix expresstion
    public static String infixToPostfix(String question) {
        Stack st = new Stack();
        String output = "";

        // loop from first character to last character
        for (int i = 0; i < question.length(); i++) {
            char c = question.charAt(i);

            // If character is Digit or letter keep it into return string
            if (Character.isLetterOrDigit(c)) {
                output += c;

            } else if (c == '(') {
                // if character is ( push into stack
                st.push(c);
            } else if (c == ')') {
                // if character is )

                if (st.isEmpty()) {
                    // Check for expression error
                    output = "\u001B[31m" + "Invalid expression" + "\u001B[37m";
                    break;
                }
                try {
                    // Pop everything out from the stack until find (
                    while (!(st.isEmpty()) && st.peek() != '(') {
                        output += st.pop();
                    }
                    st.pop();
                } catch (ArrayIndexOutOfBoundsException err) {
                    // Check for stack underflow
                    output = "\u001B[31m" + "Invalid expression" + "\u001B[37m";
                    break;
                }
            } else {
                // If character is operator

                // Pop stack when the operator priority is smaller
                while (!(st.isEmpty()) && checkPriority(c) <= checkPriority(st.peek())) {
                    output += st.pop();
                }
                st.push(c);
            }

        }

        // Clean up pop everything out of stack
        while (!(st.isEmpty())) {
            char pop = st.pop();
            if (pop != '(') {
                output += pop;
            } else {
                // Check for expression error
                output = "\u001B[31m" + "Invalid expression" + "\u001B[37m";
                break;
            }
        }

        return output;
    }

    public static int checkPriority(char ch) {
        switch (ch) {
            case '+':
                return 1;
            case '-':
                return 1;
            case '*':
                return 2;
            case '/':
                return 2;
            case '^':
                return 3;

        }
        return -1;
    }

    // Read the input file
    public static void readInput(Vector<String> question, File file) {
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                question.addElement(sc.nextLine());
            }
            // 200 OK
        } catch (FileNotFoundException err) {
            System.out.println(err);
            // Http status 404 file not found
            System.exit(404);
        }
    }

}
