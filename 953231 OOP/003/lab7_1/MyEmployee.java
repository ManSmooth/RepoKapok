public class MyEmployee {
    public static void main(String[] args) {
        String org = "Cover corp." ;

        ITstaff p1 = new ITstaff("A-chan", org,50000);
        System.out.println(p1.sayHello());
        p1.fixComputer();

        Janitor p2 = new Janitor("Sakamata", org,70000);
        System.out.println(p2.sayHello());
        p2.doCleaning();
    }
}
