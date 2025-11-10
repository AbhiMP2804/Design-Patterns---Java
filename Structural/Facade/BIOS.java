package Structural.Facade;

public class BIOS {
    public void boot(CPU cpu, Memory memory)
    {
        System.out.println("BIOS : Booting CPU and Memory Checks");
        cpu.initialise();
        memory.selfTest();
    }
}
