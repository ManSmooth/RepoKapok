package Lab12;

import java.util.concurrent.ThreadLocalRandom;

public class Grading {
    final static int STUDENT_NUM = 100;
    final static int QUESTION_NUM = 100;
    final static int CHOICES_NUM = 4;
    public static void main(String[] args) {
        char[][] students = genAns(STUDENT_NUM, QUESTION_NUM);
        char[] answer = genAns(QUESTION_NUM);
        int[] scores = new int[STUDENT_NUM];
        PassTwoDimensionalArray.printArr(students);
        PassTwoDimensionalArray.printArr(answer);

        for (int i = 0; i < students.length; i++)
            for (int j = 0; j < students[0].length; j++)
                if (students[i][j] == answer[j]) scores[i]++;
        double running_sum = 0;
        for (int i = 0; i < scores.length; i++) {
            running_sum += scores[i];
            System.out.printf("Student %d got %d (%.2f%%).\n", i + 1, scores[i], (double)(100*scores[i]/QUESTION_NUM));
        }
        running_sum /= STUDENT_NUM;
        System.out.printf("Average: %.2f (%.2f%%).", running_sum, (double)(100*running_sum/QUESTION_NUM));
    }

    public static char[][] genAns(int col, int row) {
        char[][] p = new char[col][row];
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[0].length; j++) {
                p[i][j] = (char)('A' + ThreadLocalRandom.current().nextInt(0, CHOICES_NUM));
            }
        }
        return p;
    }

    public static char[] genAns(int length) {
        char[] p = new char[length];
        for (int i = 0; i < p.length; i++) {
            p[i] = (char)('A' + ThreadLocalRandom.current().nextInt(0, CHOICES_NUM));
        }
        return p;
    }
}
