package estrutural.Decorator;

public class CafeDecorator implements Cafe{
    protected  Cafe cafeDecorado;

    public CafeDecorator(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao();
    }

    @Override
    public double getCusto() {
        return cafeDecorado.getCusto();
    }
}
