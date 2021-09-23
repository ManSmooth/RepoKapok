package Lab11;

import java.util.concurrent.ThreadLocalRandom;

public class Students {
    public static void main(String[] args) {
        int[] scores = new int[100];
        int[] gradeCount = new int[] { 0, 0, 0, 0, 0 };
        for (int i = 0; i < scores.length; i++) {
            scores[i] = ThreadLocalRandom.current().nextInt(0, 101);
        }
        for (int i : scores) {
            if (i < 80) {
                if (i < 70) {
                    if (i < 60) {
                        if (i < 50) {
                            gradeCount[4]++;
                        } else {
                            gradeCount[3]++;
                        }
                    } else {
                        gradeCount[2]++;
                    }
                } else {
                    gradeCount[1]++;
                }
            } else {
                gradeCount[0]++;
            }
        }
        int sum = 0;
        for (int i = 0; i < gradeCount.length; i++) {
            System.out.println(
                    (i == 0 ? "A: " : i == 1 ? "B: " : i == 2 ? "C: " : i == 3 ? "D: " : "F: ") + gradeCount[i]);
            sum += gradeCount[i];
        }
        System.out.println("Total Students: " + sum);
    }
}
