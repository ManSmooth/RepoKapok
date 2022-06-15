public class Bracket {
    public static void main(String[] args) {
        String text = ")(())(" ;
        // )(())(
 
        int output = 0;

        int mid = text.length()/2;
        int count = 1;
        for(int i = 0 ; i < mid ; i++){
            char ch1 = text.charAt(i) ;
            char ch2 = text.charAt(text.length()-count) ;
            
            switch(ch1){
                case ')': if(ch2 == '('){
                    output++;
                    break;
                } 

                case '(': if(ch2 == ')'){
                    output++;
                    break;
                } 
            }
            count++;
        }
        

        System.out.println(output);
    }
}
