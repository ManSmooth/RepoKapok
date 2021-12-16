package Lab3_2;

public class TV {
    private boolean state;
    private int channel;
    private int volume;

    public TV() {
        state = false;
        channel = 2;
        volume = 10;
    }

    public boolean getState() {
        return this.state;
    }

    public void switchTV() {
        this.state = !state;
    }

    public int getChannel() {
        return this.channel;
    }

    public void setChannel(int channel) {
        if (channel < 0 || channel > 99) {
            System.out.println("Invalid Channel.");
            return;
        }
        this.channel = channel;
    }

    public int getVolume() {
        return this.volume;
    }

    public void addVolume() {
        if (volume == 20) {
            System.out.println("Can't go any higher.");
            return;
        }
        this.volume++;
    }

    public void subVolume() {
        if (volume == 0) {
            System.out.println("Can't go any lower.");
            return;
        }
        this.volume--;
    }

    public String toString() {
        return String.format("State: %s\nChannel: %d\nVolume: %d", state ? "On" : "Off",
                channel, volume);
    }
}
