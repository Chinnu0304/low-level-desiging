package creationalDesignPatterns.Singleton;

import java.lang.reflect.Constructor;

public class SingletonHolderClass {

    private SingletonHolderClass() {}

    private static final class InstanceHolder{
        private static final SingletonHolderClass instance = new SingletonHolderClass();
    }

    public static SingletonHolderClass getInstance(){
        return InstanceHolder.instance;
    }

    public static void main(String[] args) {
        SingletonHolderClass instance = SingletonHolderClass.getInstance();
        SingletonHolderClass instance2 = null;

        try{
            Constructor[] constructors = SingletonHolderClass.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                constructor.setAccessible(true);
                instance2 = (SingletonHolderClass) constructor.newInstance();
                break;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

    }
}
