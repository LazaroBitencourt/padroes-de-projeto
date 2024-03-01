package abstractFactory;

public class MotoPotente extends Moto implements Veiculo{
    @Override
    public void tipoDeRoda() {
        System.out.println("Roda liga leve");
    }

    @Override
    public void potenciaDorMotor() {
        System.out.println("Motor 4 cilidros");
    }
}
