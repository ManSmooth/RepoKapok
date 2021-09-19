import java.util.Scanner ;
public class CheckQuadrant {
    public static void main(String[] args) {
        String result = " " ;
        Scanner input = new Scanner(System.in);
        System.out.print("Input degree: ");
        double degree = input.nextDouble();

        if(degree == 0 || degree == 180 || degree == 360){
            result = "X-axis" ;
        }
        else if(degree == 90 || degree == 270){
            result = "Y-axis";
        }
        else if(degree > 0 && degree < 90){
            result = "Quadrant I" ;
        }
        else if(degree > 90 && degree < 180){
            result= "Quadrant II" ;
        }
        else if(degree > 180 && degree < 270){
            result = "Quadrant III" ;
        }
        else if(degree > 270 && degree < 360){
            result = "Quadrant IV" ;
        }
        else {
            result = "Error ";
        }

        System.out.println(degree +" is in " + result);

    }
}