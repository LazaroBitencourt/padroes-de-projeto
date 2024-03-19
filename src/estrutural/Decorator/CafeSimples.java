package estrutural.Decorator;

public class CafeSimples implements Cafe{
    @Override
    public String getDescricao() {
        return "Café simples";
    }

    @Override
    public double getCusto() {
        return 1.0;
    }
}
