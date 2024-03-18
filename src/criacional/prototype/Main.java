package criacional.prototype;

public class Main {
    public static void main(String[] args) {
        Configuracao configuracao = new Configuracao(12,12,12,14);
        System.out.println(configuracao);
        System.out.println(configuracao.hashCode());
        System.out.println();
        System.out.println();

        Configuracao configuracao1 = configuracao.clone();
        configuracao1.setBrilho(80);
        System.out.println(configuracao1);
        System.out.println(configuracao1.hashCode());


    }
}
