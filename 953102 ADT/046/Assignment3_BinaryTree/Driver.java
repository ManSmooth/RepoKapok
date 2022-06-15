package Assignment3_BinaryTree;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//No Stack Edition
public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("Assignment3_BinaryTree/input.txt"));
        while (s.hasNextLine()) {
            try {
                Tree<String> precTree = eval(s.nextLine().replaceAll(" ", ""));
                System.out.println(precTree.toPostfix());
                System.out.println(precTree.toPrefix());
            }
            catch(RuntimeException e) {
                System.out.println(e.toString());
            }

        }
    }

    static Tree<String> eval(String eq) {
        Tree<String> out = new Tree<>();
        if (eq.length() == 0) {
            throw new RuntimeException("Invalid Infix Expression");
        }
        int depthIn = getRangeMin(getDepthMap(eq),0 ,eq.length(), false);
        if (depthIn > 0) {
            eq = eq.substring(Math.abs(depthIn), eq.length() - Math.abs(depthIn));
        }
        if (isNumeric(eq) || eq.length() == 1) {
            return new Tree<String>(eq);
        }
        int[] depthMap = getDepthMap(eq);
        int[] prec = getPrecMap(eq, depthMap);
        int minIndex = 0;
        for (int i = 0; i < prec.length; i++) {
            if (((prec[i] <= prec[minIndex]) && prec[i] != -1) || prec[minIndex] == -1)
                minIndex = i;
        }
        out.setData(Character.toString(eq.charAt(minIndex)));
        out.add(eval(eq.substring(0, minIndex)));
        out.add(eval(eq.substring(minIndex + 1, eq.length())));
        return out;
    }

    static int[] getDepthMap(String eq) {
        int[] depthMap = new int[eq.length()];
        int depth = 0;
        for (int i = 0; i < eq.length(); i++) {
            depth += eq.charAt(i) == '(' ? 1 : 0;
            depthMap[i] = Math.abs(depth);
            depth -= eq.charAt(i) == ')' ? 1 : 0;
        }
        return depthMap;
    }

    static int[] getPrecMap(String eq, int[] depthMap) {
        int[] prec = new int[eq.length()];
        for (int i = 0; i < eq.length(); i++) {
            prec[i] = depthMap[i] == 0 ? Prec(eq.charAt(i)) : -1;
        }
        return prec;
    }

    static int getRangeMin(int[] arr, int start, int end, boolean mode) {
        int minIndex = start;
        for (int j = start; j < end; j++) {
            if ((arr[j] < arr[minIndex]) || minIndex == -1)
                minIndex = j;
        }
        if(mode) {
            return minIndex;
        }
        return arr[minIndex];
    }

    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public static boolean isNumeric(String str) { 
        return str.matches("-?\\d+(\\.\\d+)?");
      }

}
