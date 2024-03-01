package abstractFactory;

public class CarroPopular extends Carro implements Veiculo{
    @Override
    public void tipoDeRoda() {
        System.out.println("Roda de aço");
    }

    @Override
    public void potenciaDorMotor() {
        System.out.println("Motor fraco 120cv");
    }
}
