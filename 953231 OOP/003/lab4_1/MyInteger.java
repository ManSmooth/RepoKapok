//642115003 Kan Katpark
public class MyInteger {
    private int num;
    
    public MyInteger(int num){
        this.num = num ;
    }

    public int getNum(){
        return this.num;
    }

    public boolean isOdd(){
        return this.num % 2 == 1 ;
    }

    public static boolean isOdd(int n){
        return n % 2 == 1 ;
    }


    public boolean isEven(){
        return this.num % 2 == 0 ;
    }

    public static boolean isEven(int n){
        return n % 2 == 0 ;
    }

    public static boolean isPrime(int n){
        for(int i = 2; i < n ; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public boolean isPrime(){
        for(int i = 2; i < this.num ; i++){
            if(this.num % i == 0) return false;
        }
        return true;
    }

    public boolean equals(int n){
        return this.num == n;
    }

    public boolean equals(MyInteger n){
        return this.num == n.getNum();
    }

}
