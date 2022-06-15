public class MySquare {
    public static void main(String[] args) {
        GeometricObject[] arr = new GeometricObject[5];
        arr[0] = new Square(20);
        arr[2] = new Square(5);
        arr[4] = new Square(10);

        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.print(i + ": ");
                System.out.println("Area: " + arr[i].getArea());
                
                if (arr[i] instanceof Colorable) {
                    ((Colorable)arr[i]).howToColor();
                }

            } catch (NullPointerException err) {
                System.out.println("Can not find area and how to color the GeometricObject");

            }

        }

    }
}
