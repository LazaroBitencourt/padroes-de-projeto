package factoryMethod;

public class Instancia {

    public static Veiculo getInstance(String tipo){
        Fabrica fabrica = new FabricaDeVeiculo();
        return fabrica.criaVeiculo(tipo);
    }

}
