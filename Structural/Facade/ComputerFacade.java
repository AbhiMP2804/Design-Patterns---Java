package Structural.Facade;

public class ComputerFacade {
    private BIOS bios;
    private CoolingSystem coolingSystem;
    private CPU cpu;
    private HardDrive hardDrive;
    private Memory memory;
    private OperatingSystem operatingSystem;
    private PowerSupply powerSupply;



    public ComputerFacade(BIOS bios, CoolingSystem coolingSystem, CPU cpu, HardDrive hardDrive, Memory memory,
            OperatingSystem operatingSystem, PowerSupply powerSupply) {
        this.bios = bios;
        this.coolingSystem = coolingSystem;
        this.cpu = cpu;
        this.hardDrive = hardDrive;
        this.memory = memory;
        this.operatingSystem = operatingSystem;
        this.powerSupply = powerSupply;
    }


    public void startComputer()
    {
        System.out.println("--------------Starting Computer-----------");
        powerSupply.providerPower();
        coolingSystem.startsFan();
        bios.boot(cpu, memory);
        hardDrive.spinUp();
        operatingSystem.load();
        System.out.println("Computer Booted Successfully !!!!!");
    }
}
