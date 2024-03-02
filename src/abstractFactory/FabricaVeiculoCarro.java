package abstractFactory;

import java.util.HashMap;

public class FabricaVeiculoCarro implements FabricaVeiculo {

    private HashMap<String, Carro> prototipos = new HashMap<>();

    public FabricaVeiculoCarro() {
        prototipos.put("carroDeLuxo", new CarroDeLuxo());
        prototipos.put("carroPopular", new CarroPopular());
    }

    @Override
    public Carro fabricaVeiculo(String tipo) {
        return prototipos.get(tipo);
    }
}
