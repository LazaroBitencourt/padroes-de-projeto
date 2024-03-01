package abstractFactory;
public class TestFactory {
    public static Carro montarCarro(String tipo) {
        CarroFactory cf = null;
        switch (tipo) {
            case "luxo":
                cf = new CarroLuxoFactory();
                break;
            case "popular":
                cf = new CarroPopularFactory();
        }
        Carro carro = new Carro();
        carro.setRoda(cf.montarRoda());
        carro.setSom(cf.montarSom());
        return carro;
    }
}
