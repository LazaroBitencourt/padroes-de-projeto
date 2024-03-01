package abstractFactory;

public class MotoSimples extends Moto implements Veiculo
{
    @Override
    public void tipoDeRoda() {
        System.out.println("Roda de aço");
    }

    @Override
    public void potenciaDorMotor() {
        System.out.println("Motor monocilíndrico");
    }
}
