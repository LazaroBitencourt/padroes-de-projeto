package abstractFactory;
public class CarroPopularFactory implements CarroFactory{
    @Override
    public Roda montarRoda() {
        return new RodaSimples();
    }

    @Override
    public Som montarSom() {
        return new TocaFitas();
    }
}
