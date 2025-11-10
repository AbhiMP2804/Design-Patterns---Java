package Structural.Facade;


public class Main {
   
    public static void main(String[] args) {
        
        BIOS bios = new BIOS();
        CoolingSystem coolingSystem = new CoolingSystem();
        CPU cpu = new CPU();
        HardDrive hardDrive = new HardDrive();
        Memory memory = new Memory();
        OperatingSystem operatingSystem = new OperatingSystem();
        PowerSupply powerSupply = new PowerSupply();

        // Pass dependencies to Facade
        ComputerFacade computer = new ComputerFacade(
            bios, coolingSystem, cpu, hardDrive, memory, operatingSystem, powerSupply
        );

        // Start computer
        computer.startComputer();
    }
}
