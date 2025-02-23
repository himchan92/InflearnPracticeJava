package poly.car;

public class CarMain1 {
    public static void main(String[] args) {
        Driver d = new Driver();

        K3Car k = new K3Car();
        d.setCar(k); //k3car 대상
        d.drive();

        //차량 변경
        Model3Car m = new Model3Car();
        d.setCar(m);
        d.drive();
    }
}
