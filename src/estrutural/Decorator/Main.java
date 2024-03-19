package estrutural.Decorator;

public class Main {
    public static void main(String[] args) {
        Cafe meuCafe = new CafeSimples();
        System.out.println("Descrição: " + meuCafe.getDescricao());
        System.out.println("Custo: $" + meuCafe.getCusto());

        meuCafe = new CafeCremeDecorado(meuCafe);
        System.out.println("\nDescrição: " + meuCafe.getDescricao());
        System.out.println("Custo: $" + meuCafe.getCusto());

        meuCafe = new CafeCremeChocolateDecorado(meuCafe);
        System.out.println("\nDescrição: " + meuCafe.getDescricao());
        System.out.println("Custo: $" + meuCafe.getCusto());
    }
}
