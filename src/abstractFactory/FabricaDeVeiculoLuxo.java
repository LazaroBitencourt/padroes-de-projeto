package abstractFactory;

public class FabricaDeVeiculoLuxo implements Fabrica{

    public Veiculo fabricar(String tipo) {
        if(tipo.equalsIgnoreCase("carroDeLuxo")){
            return new CarroDeLuxo();
        }else if (tipo.equalsIgnoreCase("motoLuxo")) {
            return new MotoPotente();
        }
        return null;
    }
}
