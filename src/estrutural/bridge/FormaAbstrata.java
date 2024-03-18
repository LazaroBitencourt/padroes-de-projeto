package estrutural.bridge;

public class FormaAbstrata implements Forma{

    private Desenho desenho;

    public FormaAbstrata(Desenho desenho) {
        this.desenho = desenho;
    }

    @Override
    public void desenhar() {
        desenho.desenharForma();
    }
}
