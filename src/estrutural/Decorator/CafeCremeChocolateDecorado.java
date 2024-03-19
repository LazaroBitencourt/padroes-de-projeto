package estrutural.Decorator;

public class CafeCremeChocolateDecorado extends CafeCremeDecorado{
    public CafeCremeChocolateDecorado(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao() + " e chocolate";
    }

    @Override
    public double getCusto() {
        return cafeDecorado.getCusto() + 1.0;
    }
}
