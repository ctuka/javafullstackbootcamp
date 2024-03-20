package d5scanners_incrementdecrement.d2900p_collections;

public class AuidiA5 implements Brake, Engine, AirConditioner{
    @Override
    public void abs() {
        System.out.println("Audi A5 has ABS Brake System");
    }

    @Override
    public void eps() {
        System.out.println("Audi A5 has EPS System");
    }

    @Override
    public void eco() {
        System.out.println("Audi A5 has Eco Engine");
    }

    @Override
    public void turbo() {
        System.out.println("Audi A5 has Turbo Engine");
    }

    @Override
    public void gas() {
        System.out.println("Audi A5 has Gas Engine");
    }

    @Override
    public void digital() {
        System.out.println("Audi A5 has digital Clima");
    }
}
