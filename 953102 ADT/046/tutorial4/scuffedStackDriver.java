package tutorial4;

public class scuffedStackDriver {

    public static void main(String[] args) {
        scuffedStack p = new scuffedStack(9);
        char[] ID = "642115046".toCharArray();
        for (char c : ID) {
            p.push(Integer.valueOf(String.valueOf(c)));
        }
        System.out.println(p.peek());
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.pop());
    }
}
