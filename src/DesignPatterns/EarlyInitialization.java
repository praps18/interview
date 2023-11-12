package DesignPatterns;

public class EarlyInitialization {
    private EarlyInitialization(){}


    private static final EarlyInitialization newInstance=new EarlyInitialization();

    public static EarlyInitialization getNewInstamce(){
        return newInstance;
    }

}
