package criacional.Singleton;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro1 = Tabuleiro.getInstance();
        Tabuleiro tabuleiro2 = Tabuleiro.getInstance();

        System.out.println(tabuleiro1);
        System.out.println(tabuleiro2);
    }
}
