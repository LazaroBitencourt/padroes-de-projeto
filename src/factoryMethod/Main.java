package factoryMethod;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = Instancia.getInstance("carro");
        carro.acelera();

        carro.frear();
    }
}
