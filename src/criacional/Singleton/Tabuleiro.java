package criacional.Singleton;

public class Tabuleiro {

    private static Tabuleiro instance = null;
    private Tabuleiro(){
    }
    public static Tabuleiro getInstance(){
        if (instance == null){
            instance = new Tabuleiro();
        }
        return instance;
    }
}
