public class ServiceStation {

    public void check(Car car) {
        printUpdate(car);
        car.checkEngine();
    }

    public void check(Truck truck) {
        printUpdate(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

    public void check(Bicycle bicycle) {
        printUpdate(bicycle);
    }

    private void printUpdate(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
}