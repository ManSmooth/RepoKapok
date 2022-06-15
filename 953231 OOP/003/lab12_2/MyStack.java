//642115003 Kan Katpark

public class MyStack {
    public static void main(String[] args) {
        GenericStack<String> st = new GenericStack<>(2) ;
        System.out.println("Stack CAP.: " + st.getCap());

        st.push("Apple");
        st.push("Orange");
        st.push("Grape");
        st.push("Banana");
        st.push("Mango");
        System.out.println("Stack size: "+ st.getSize());
        while(!(st.isEmpty())){
            System.out.println(st.pop());
        }
        System.out.println("Stack CAP.: " + st.getCap());

    }
}
