// 642115003 Kan Katpark

public class TV {
    private int volume;
    private int channel;
    private String flag;

    public TV() {
        this.flag =  "OFF";
        this.volume = 10;
        this.channel = 2;
    }

    public void turnOn() {
        this.flag = "ON";
    }

    public void turnOff() {
        this.flag = "OFF";
    }

    public String getFlag(){
        return this.flag;
    }
    
    public int getChannel() {
        return this.channel;
    }
    
    public void setChannel(int c) {
        if (c >= 0 && c <= 99) {
            int temp = getChannel();
            this.channel = c;
            System.out.println("Channel has been changed from " + temp + " to " + getChannel());
        }else{
            System.out.println("You input wrong number");
        }
    }

    public int getVolume(){
        return this.volume;
    }

    public void raiseVolume(){
        if( getVolume() >= 20){
            System.out.println("Can not raise volume more higher");
            return ;
        }
        this.volume++;
    }

    public void lowVolume(){
        if ( getVolume() <= 0){
            System.out.println("Can not lower volume more lower");
            return ;
        }
        this.volume--;
    }

    public void setVolume(int v){
        if(v >= 0 && v <= 20){
            int temp = getVolume();
            this.volume = v;
            System.out.println("Volume has been changed from " + temp + " to " + getVolume());
        }else{
            System.out.println("You input wrong number");
        }
    }

}
