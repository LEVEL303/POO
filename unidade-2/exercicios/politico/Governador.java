public class Governador extends Politico{
    private String estadoGovernado;
    
    public Governador(String nome, int idade, String partido, String estadoGovernado) {
        super(nome, idade, partido);
        this.estadoGovernado = estadoGovernado;
    }

    public String toString() {
        return super.toString() + "; Estado Governado: " + estadoGovernado;
    }
}
