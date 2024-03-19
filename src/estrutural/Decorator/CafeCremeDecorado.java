package estrutural.Decorator;

public class CafeCremeDecorado extends CafeDecorator{
    public CafeCremeDecorado(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao() + ", com creme";
    }

    @Override
    public double getCusto() {
        return cafeDecorado.getCusto() + 0.5;
    }
}
