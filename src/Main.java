public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("bmx", 2);
        Car car = new Car("bmw", 4);
        Truck truck = new Truck("truck", 6);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle, car, truck);
    }
}