//грузовик
public class Truck extends Transport implements CheckEngine, CheckTrailer {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}