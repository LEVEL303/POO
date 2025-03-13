public class Automovel {
    protected int ano;
    protected String modelo;
    protected String cor;

    public Automovel(int ano, String modelo, String cor) {
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
    }

    public float quantoCusta() {
        return (ano < 2010) ? 60000 : 90000;
    }
}
