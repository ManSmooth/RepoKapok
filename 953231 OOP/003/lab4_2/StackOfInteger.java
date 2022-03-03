//642115003 Kan Katpark

public class StackOfInteger {
    
    private int[] item;
    private int count;

    public StackOfInteger(){
        this.item = new int[10];
        this.count = 0;
    }

    public StackOfInteger(int cap){
        this.item = new int[cap];
        this.count = 0;
    }

    public void push(int x){
        if(this.count >= item.length) {
            System.out.println("Stack Overflow");
            return ;
        }

        this.item[count] = x;
        this.count++;
        return ;

    }

    public int pop(){
        if(this.count <= 0){
            System.out.println("Stack Underflow");
            return -1;
        }
        
        int temp = item[count-1];
        this.count--;

        return temp;
    }

    public int peek(){
        return this.item[count-1];
    }

    public int count(){
        return this.count;
    }

}