package abstractFactory;

public class Main {
    public static void main(String[] args) {
        Veiculo carroLuxo = Instance.getInstanceLuxo("carroDeLuxo");
        carroLuxo.potenciaDorMotor();
    }
}
