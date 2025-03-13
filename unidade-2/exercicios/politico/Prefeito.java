public class Prefeito extends Politico{
    private String cidadeGovernada;

    public Prefeito(String nome, int idade, String partido, String cidadeGovernada) {
        super(nome, idade, partido);
        this.cidadeGovernada = cidadeGovernada;
    }

    public String toString() {
        return super.toString() + "; Cidade Governada: " + cidadeGovernada;
    }
}
