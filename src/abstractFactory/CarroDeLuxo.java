package abstractFactory;

public class CarroDeLuxo extends Carro implements Veiculo{
    @Override
    public void tipoDeRoda() {
        System.out.println("Roda liga leve");
    }

    @Override
    public void potenciaDorMotor() {
        System.out.println("Motor potente 800cv");
    }
}
