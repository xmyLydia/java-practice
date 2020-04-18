package OOP.part4Polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mingyux
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, "Base Car");
        CarA carA = new CarA(5, "Base Car", "Car A");
        CarB carB = new CarB(6, "Base Car");
        car.accelerate(10);
        carA.accelerate(10);
        carB.accelerate(10);
        List<Car> list = new ArrayList<>();
        list.add(car);
        list.add(carA);
        list.add(carB);
        list.forEach(element -> System.out.println(element.getName()));
    }
}
