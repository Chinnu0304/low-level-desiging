package creationalDesignPatterns.abstractFactoryDesignPattern;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory computerFactory) {
        return computerFactory.createComputer();
    }

    public static void main(String[] args) {
        ComputerAbstractFactory pcFactory = new PCFactory("8gb", "1TB", "Intel");
        Computer pc = ComputerFactory.getComputer(pcFactory);
        System.out.println(pc.getCPU()+" "+ pc.getHDD()+" "+pc.getRAM());
    }
}
