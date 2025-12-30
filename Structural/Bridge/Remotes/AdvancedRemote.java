package Structural.Bridge.Remotes;
import Structural.Bridge.Devices.Device;

public class AdvancedRemote extends BasicRemote {


    public AdvancedRemote(Device device)
    {
        super.device=device;
    }

    public void mute()
    {
        System.out.println("Remote : Mute");
        device.setVolume(0);
    }

    
}
