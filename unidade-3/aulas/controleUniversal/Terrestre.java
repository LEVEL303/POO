public abstract class Terrestre extends Veiculo {
    private int qtdRodas;

    public Terrestre(int capacidade, int qtdRodas) {
        super(capacidade);
        this.qtdRodas = qtdRodas;
    }

    public String toString() {
        return super.toString() + "; Quantidade de rodas: " + qtdRodas;
    }
}