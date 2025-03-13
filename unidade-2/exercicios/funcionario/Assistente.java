public class Assistente extends Funcionario{
    private String numeroDeMatricula;

    public Assistente(String nome, float salario, String numeroDeMatricula) {
        super(nome, salario);
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public String getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(String numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public String toString() {
        return super.toString() + "; Numero de matricula: " + numeroDeMatricula;
    }
}
