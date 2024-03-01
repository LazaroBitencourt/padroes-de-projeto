package abstractFactory;

public class FabricaVeiculoSimples implements Fabrica{
    @Override
    public Veiculo fabricar(String tipo) {
        if (tipo.equalsIgnoreCase("carroPopular")) {
            return new CarroPopular();
        } else if (tipo.equalsIgnoreCase("MotoPopular")) {
            return new MotoSimples();
        }
        return null;
    }

}
