package prototype;

public class Configuracao  implements  Cloneable{
    public int brilho;
    public int volume;
    public int contraste;
    public int sombra;

    public Configuracao(int brilho, int volume, int contraste, int sombra) {
        this.brilho = brilho;
        this.volume = volume;
        this.contraste = contraste;
        this.sombra = sombra;
    }

    public int getBrilho() {
        return brilho;
    }

    public void setBrilho(int brilho) {
        this.brilho = brilho;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getContraste() {
        return contraste;
    }

    public void setContraste(int contraste) {
        this.contraste = contraste;
    }

    public int getSombra() {
        return sombra;
    }

    public void setSombra(int sombra) {
        this.sombra = sombra;
    }

    @Override
    public String toString() {
        return "Configuracao{" +
                "brilho=" + brilho +
                ", volume=" + volume +
                ", contraste=" + contraste +
                ", sombra=" + sombra +
                '}';
    }

    @Override
    public Configuracao clone() {
        try {
            Configuracao clone = (Configuracao) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
