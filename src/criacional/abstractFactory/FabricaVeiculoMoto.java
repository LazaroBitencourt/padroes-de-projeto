package criacional.abstractFactory;
import java.util.HashMap;
public class FabricaVeiculoMoto implements FabricaVeiculo{

    private HashMap<String, Moto> prototipos = new HashMap<>();

    public FabricaVeiculoMoto() {
        prototipos.put("motoPotente",new MotoPotente());
        prototipos.put("motoFraca",new MotoFraca());
    }

    @Override
    public Moto fabricaVeiculo(String tipo) {
        return prototipos.get(tipo);
    }
}
