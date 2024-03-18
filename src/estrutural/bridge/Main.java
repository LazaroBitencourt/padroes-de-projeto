package estrutural.bridge;

public class Main {
    public static void main(String[] args) {
        Forma formaLinha = new FormaAbstrata(new DesenhoLinha());
        Forma formaCirculo = new FormaAbstrata(new DesenhoCirculo());
        Forma formaQuadrado = new FormaAbstrata(new DesenhoQuadrado());

        formaLinha.desenhar();
        formaCirculo.desenhar();
        formaQuadrado.desenhar();

    }
}
