package DesignPatterns;

import java.lang.reflect.InvocationTargetException;

public class VehicleFactory {
    public static<T> T  getVehicle(Class<T> c) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
return  c.getDeclaredConstructor().newInstance();
    }
}
