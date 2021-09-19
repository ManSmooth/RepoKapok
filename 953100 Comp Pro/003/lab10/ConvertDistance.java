public class ConvertDistance {
    public static void main(String[] args){
        
        System.out.print("\t Miles to Kilometers\t");
        System.out.println("\n---------------------------------------------");
        for(int i = 1 ; i <= 20;i++ ){
        System.out.print(i+"\t");    
        mileToKilo(i);
        }
        System.out.println("");
        System.out.print("\t Kilometers to Miles\t");
        System.out.println("\n---------------------------------------------");
        for(int i = 1 ; i <= 20;i++ ){
        System.out.print(i+"\t");     
        kiloToMile(i);
        }
    }

    public static void mileToKilo(double mile){
        System.out.printf("\t %.4f \t \n",mile*1.609);
    }

    public static void kiloToMile(double kilo){
        System.out.printf("\t %.4f \t \n",kilo/1.609);
    }

}