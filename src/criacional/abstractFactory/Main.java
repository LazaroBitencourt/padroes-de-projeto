package criacional.abstractFactory;



public class Main {
    public static void main(String[] args) {
        FabricaVeiculo fabricaDeCarros = new FabricaVeiculoCarro();
        FabricaVeiculo fabricaDeMotos = new FabricaVeiculoMoto();
        Veiculo carroLuxo = fabricaDeCarros.fabricaVeiculo("carroDeLuxo");
        Veiculo carroPopular = fabricaDeCarros.fabricaVeiculo("carroPopular");
        carroPopular.motor();
        carroLuxo.motor();
    }
}
