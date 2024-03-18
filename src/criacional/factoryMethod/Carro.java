package criacional.factoryMethod;

public class Carro implements Veiculo{
    @Override
    public void acelera() {
        System.out.println("Pisa no pedal de acelerador, acelera o carro...");
    }

    @Override
    public void frear() {
        System.out.println("Pisa no pedal de freio, freia o carro...");
    }
}
