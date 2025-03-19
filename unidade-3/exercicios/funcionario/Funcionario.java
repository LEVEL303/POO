public class Funcionario {
    private String nome;
    private float salarioPorHora;
    private int horasPorDia;
    
    public Funcionario(String nome) {
        this.nome = nome;
        this.salarioPorHora = 2.0F;
        this.horasPorDia = 8;
    }

    public Funcionario(String nome, float salarioPorHora, int horasPorDia) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.horasPorDia = horasPorDia;
    }

    public float salarioPorDia() {
        return salarioPorHora * horasPorDia;
    }

    public String toString() {
        return "Nome: " + nome + "; Salario por hora: R$" + salarioPorHora + "; Quantidade de horas por dia: " + horasPorDia;
    }
}