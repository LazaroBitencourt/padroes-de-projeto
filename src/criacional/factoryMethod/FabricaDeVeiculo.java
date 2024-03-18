package criacional.factoryMethod;

public class FabricaDeVeiculo implements Fabrica{
    @Override
    public Veiculo criaVeiculo(String tipo) {
        if (tipo.equalsIgnoreCase("moto")) {
            return new Moto();
        } else if (tipo.equalsIgnoreCase("carro")) {
            return new Carro();
        }
        return null;
    }
}
