package Lab3_2;

public class TVDriver {
    public static void main(String[] args) {
        TV tv = new TV();
        System.out.printf("Initial State\n%s\n\n", tv);
        tv.switchTV();
        tv.setChannel(20);
        tv.addVolume();
        tv.addVolume();
        System.out.printf("Current State\n%s\n\n", tv);
        tv.setChannel(100);
        for (int i = 0; i < 9; i++) {
            tv.addVolume();
        }
        System.out.printf("Current State\n%s\n\n", tv);
    }
}
