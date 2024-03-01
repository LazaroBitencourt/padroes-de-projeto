package abstractFactory;

public class Main {
    public static void main(String[] args) {

        Carro carroDeLuxo = TestFactory.montarCarro("luxo");
        Carro carroPopular = TestFactory.montarCarro("popular");

      System.out.println(carroPopular);

    }
}
