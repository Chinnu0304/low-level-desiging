package creationalDesignPatterns.abstractFactoryDesignPattern;

public class Server implements Computer{

    private String HDD;
    private String CPU;
    private String RAM;

    public Server(String HDD, String CPU, String RAM) {
        this.HDD = HDD;
        this.CPU = CPU;
        this.RAM = RAM;
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
