package Structural.Bridge;

import Structural.Bridge.Devices.Device;
import Structural.Bridge.Devices.TV;
import Structural.Bridge.Devices.Radio;
import Structural.Bridge.Remotes.BasicRemote;
import Structural.Bridge.Remotes.AdvancedRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.Power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.Power();
        advancedRemote.mute();
        device.printStatus();
    }
}