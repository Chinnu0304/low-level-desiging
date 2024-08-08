package creationalDesignPatterns.abstractFactoryDesignPattern;

public class PCFactory implements ComputerAbstractFactory {

    private final String RAM;
    private final String HDD;
    private final String CPU;

    public PCFactory(String RAM, String HDD, String CPU) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    @Override
    public Computer createComputer() {
        return new PC(RAM, HDD, CPU);
    }
}
