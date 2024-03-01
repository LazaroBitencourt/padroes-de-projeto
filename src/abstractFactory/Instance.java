package abstractFactory;

public class Instance {
    public static Veiculo getInstanceLuxo(String tipo){
        Fabrica fabrica = new FabricaDeVeiculoLuxo();
        Veiculo veiculo = fabrica.fabricar(tipo);
        return veiculo;
    }public static Veiculo getInstanceSimples(String tipo){
        Fabrica fabrica = new FabricaVeiculoSimples();
        Veiculo veiculo = fabrica.fabricar(tipo);
        return veiculo;
    }
}
