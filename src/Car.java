//авто
public class Car extends Transport implements UpdateTyre, CheckEngine {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}