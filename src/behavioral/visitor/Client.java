package behavioral.visitor;


public class Client {

    public static void main(String[] args) {
        final Car car = new Car();

        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());
        car.getCarParts().add(new Wheel());

        car.getCarParts().add(new Engine());

        car.getCarParts().add(new Light());
        car.getCarParts().add(new Light());

        car.upgrade();
        car.print();
        car.render();
    }

}
