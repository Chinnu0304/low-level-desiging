package creationalDesignPatterns.abstractFactoryDesignPattern;

public class PC implements Computer{

    private final String RAM;
    private final String HDD;
    private final String CPU;

    public PC(String ram, String hdd, String CPU) {
        this.RAM = ram;
        this.HDD = hdd;
        this.CPU = CPU;
    }
    @Override
    public String getHDD() {
        return this.HDD;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }

    @Override
    public String getRAM() {
        return this.RAM;
    }
}
