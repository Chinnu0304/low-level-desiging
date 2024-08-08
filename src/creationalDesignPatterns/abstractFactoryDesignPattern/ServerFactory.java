package creationalDesignPatterns.abstractFactoryDesignPattern;

public class ServerFactory implements ComputerAbstractFactory{

    private final String RAM;
    private final String HDD;
    private final String CPU;
    public ServerFactory(String ram, String hdd, String cpu) {
        this.RAM = ram;
        this.HDD = hdd;
        this.CPU = cpu;
    }
    @Override
    public Computer createComputer() {
        return new Server(RAM, HDD, CPU);
    }
}
