package Structural.Bridge.Devices;

public class Radio implements Device {

    private boolean on = false;
    private int vol = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return vol;
    }

    @Override
    public void setVolume(int percent) {
        if(percent>100)
            {
                vol=100;
            }
            else if(percent<0)
                {
                    vol=0;
                }
                else 
                    {
                        vol = percent;
                    }

    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if(channel<1) 
            {
                this.channel =1;
            }
            else {
                this.channel=channel;
            }
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm radio.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + vol + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
    
}
