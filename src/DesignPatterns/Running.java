package DesignPatterns;

import java.lang.reflect.InvocationTargetException;

public class Running {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Vehicle c=VehicleFactory.getVehicle(Car.class);
        System.out.println(c.getName());
    }
}
