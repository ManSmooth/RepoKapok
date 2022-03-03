//642115003 Kan Katpark
class TVPreset {
    private String mode ;
    private int blackLight ;
    private int contrast ;
    private int brightness ;
    private int sharpness ;
    private int color ;

    //constructor
    public TVPreset(){
        this.mode = "Standard" ;
        this.blackLight = 14 ;
        this.contrast = 69 ; 
        this.brightness = 45 ;
        this.sharpness = 50 ; 
        this.color = 50 ;

    }

    //getter
    public String getMode(){
        return this.mode ;
    }
    public int getBlackLight() {
        return this.blackLight ;
    }
    public int getContrast() {
        return this.contrast ;
    }
    public int getBrightness() {
        return this.brightness ;
    }
    public int getSharpness() {
        return this.sharpness ;
    }
    public int getColor(){
        return this.color ;
    }

    //setter 
    public void setMode(String mode){
        this.mode = mode ;
    }
    public void setBlackLight(int x){
        this.blackLight = x ;
    }
    public void setContrast(int x){
        this.contrast = x ;
    }
    public void setBrightness(int x){
        this.brightness = x ;
    }
    public void setSharpness(int x){
        this.sharpness = x ;
    }
    public void setColor(int x){
        this.color = x ;
    }


    //ToString
    public String toString(){
        return "TV mode: " + this.mode + " blacklight: "+ this.blackLight +" brightness: "+this.brightness
        +" sharpness: "+ this.sharpness + " color: " + this.color ;
    }

    //set mode to Movie mode
    public void changeToMovie(){
        this.mode = "Movie" ;
        this.blackLight = 10 ;
        this.contrast = 50 ;
        this.brightness = 40 ; 
        this.sharpness = 70 ;
        this.color = 60 ;

        System.out.println("Change mode to movie");
    }

    //set mode to Standard mode
    public void changeToStandard() {

        this.mode = "Standard" ;
        this.blackLight = 14 ;
        this.contrast = 69 ; 
        this.brightness = 45 ;
        this.sharpness = 50 ; 
        this.color = 50 ;

        System.out.println("Change mode to standard");

    }


}