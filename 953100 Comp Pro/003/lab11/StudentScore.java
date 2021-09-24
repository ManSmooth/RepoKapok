public class StudentScore {
    public static void main(String[] args) {
        int[] student_score = new int[100];
        for(int i = 0;i<student_score.length;i++ ){
            student_score[i] = (int)(Math.random()*100);
        }

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        for(int i = 0 ;i<student_score.length;i++){

            if(student_score[i] >= 80 ){
                countA++;
            }else if(student_score[i] >= 70 ){
                countB++;
            }
            else if(student_score[i] >= 60){
                countC++;
            }
            else if(student_score[i] >= 50){
                countD++;
            }
            else{
                countF++;
            }
            
        }

        System.out.println("Student got A =>"+countA);
        System.out.println("Student got B =>"+countB);
        System.out.println("Student got C =>"+countC);
        System.out.println("Student got D =>"+countD);
        System.out.println("Student got F =>"+countF);
        System.out.println("Total student =>"+student_score.length);


    }

    
}
