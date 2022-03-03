//642115003 Kan Katpark
public class TestTV {
    public static void main(String[] args) {
        // Declare TV 
        TVPreset t1 = new TVPreset() ;
        System.out.println(t1.toString());

        // change mode to movie mode
        t1.changeToMovie();
        System.out.println(t1.toString());

        // test getter setter method
        t1.setBlackLight(20);
        t1.setBrightness(50);
        t1.setSharpness(40);
        t1.setColor(65);
        t1.setMode("Test Mode");
        System.out.println(t1.getMode() + " BlackLight: " + t1.getBlackLight());
        System.out.println(t1.toString());

        // Change mode to standard
        t1.changeToStandard();
        System.out.println(t1.toString());
    }
}
