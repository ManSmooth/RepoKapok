// 642115003 Kan Katpark
public class LoopOne {
    public static void main(String[] arg){
        
        int anakinMoney = anakinCalculation();
        System.out.println("On April 30, Anakin will have "+ anakinMoney + " bahts");

        int vaderDay = vaderCalculation(1000000);
        System.out.println("Vader have to spend " + vaderDay + " days ");

    }

    public static int anakinCalculation(){
        // 1 2 4 8 .... April has 30 days, r=2  S30 = 1(2^30-1)/1

        int totalMoney = 0;
        int moneyOneDay = 1;
        for(int i = 1; i<=30;i++ ){
            totalMoney += moneyOneDay;
            // System.out.println(i+" : " + moneyOneDay + "  =>  "+ totalMoney);
            moneyOneDay *= 2;
        }
        return totalMoney;
    }

    public static int vaderCalculation(int target){
        int moneyOneDay = 1;
        int totalMoney = 0 ;
        int count = 1;
        // 1000000 = 1(2^n-1) = 19.6~
        while(totalMoney < target){
            totalMoney += moneyOneDay;
            // System.out.println(count + " : "+ moneyOneDay + " => "+ totalMoney);
            moneyOneDay *= 2 ;
            count++;
        }
        return count - 1;

    }

}
