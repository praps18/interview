package DesignPatterns;

public class SingleTonCheck {
    public static void main(String[] args) {
        LazyInitialization l1=LazyInitialization.getNewInstance();
        LazyInitialization l2=LazyInitialization.getNewInstance();
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());

        EarlyInitialization e1=EarlyInitialization.getNewInstamce();
        EarlyInitialization e2=EarlyInitialization.getNewInstamce();
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
