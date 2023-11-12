package DesignPatterns;

public class LazyInitialization {
    private LazyInitialization(){
    }

    private static  LazyInitialization newInstance;

    public static  LazyInitialization getNewInstance(){
        if(newInstance==null){
            newInstance=new LazyInitialization();
        }
        return newInstance;
    }
}
