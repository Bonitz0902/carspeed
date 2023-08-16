public class Car {

    private final String name;
    private int speed;
    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp(int acceleration){
        speed += acceleration;
        System.out.printf("%s: speed up to %d km/h %n", name, speed);
    }
}
