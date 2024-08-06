package creationalDesignPatterns.factoryDesignPattern;

import javax.sound.midi.SysexMessage;

public class Factory {

    public static Computer createComputer(String type, String ram, String hdd, String cpu) {
        if(type.equals("PC")) {
            return new PC(ram, hdd, cpu);
        }
        return new Server(ram, hdd, cpu);
    }

    public static void main(String[] args) {
        Computer pc = Factory.createComputer("PC", "8GB", "1TB", "intel");
        Computer server = Factory.createComputer("Server", "8GB", "1TB", "intel");
        System.out.println(pc.toString());
        System.out.println(server.toString());
    }
}
