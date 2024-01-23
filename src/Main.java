import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bicycle> bicycles = new ArrayList<>();
        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();
        cars.add(new Car("car1", 4));
        cars.add(new Car("car2", 4));
        trucks.add(new Truck("truck1", 6));
        trucks.add(new Truck("truck2", 8));
        bicycles.add(new Bicycle("bicycle1", 2));
        bicycles.add(new Bicycle("bicycle2", 2));

        ServiceStation station = new ServiceStation();
        cars.forEach(station::check);
        trucks.forEach(station::check);
        bicycles.forEach(station::check);
    }
}