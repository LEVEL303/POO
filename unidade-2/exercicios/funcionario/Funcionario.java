public class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(float autmento) {
        salario += autmento;
    }

    public float ganhoAnual() {
        return salario * 13;
    }

    public String toString() {
        return "Nome: " + nome + "; Salario: " + salario;
    }
}
