package Lab10;

public class distanceConv {
    private static double mileToKilometer(double x) { return x * 1.609; }
    private static double kilometerToMile(double x) { return x / 1.609; }
    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers\t\tKilometers\t\tMiles");
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d\t\t%8.3f\t\t%d\t\t\t%8.3f\n", i, mileToKilometer(i), 5 * (i + 3), kilometerToMile(5 * (i + 3)));
        }
    }
}
