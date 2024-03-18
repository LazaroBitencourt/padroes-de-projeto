package criacional.factoryMethod;

public class Moto implements Veiculo{
    @Override
    public void acelera() {
        System.out.println("Gira manopla, acelera a moto...");
    }

    @Override
    public void frear() {
        System.out.println("Pisa no pedal de freio e aperta manete de freio, freia a moto...");
    }
}
