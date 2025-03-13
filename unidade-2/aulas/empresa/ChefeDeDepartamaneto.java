public class ChefeDeDepartamaneto extends Funcionario {
    private String departamento;

    public ChefeDeDepartamaneto(String nome, String identidade, float salario, String departamento) {
        super(nome, identidade, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String toString() {
        return super.toString() + "; Departamento: " +  departamento;
    }
}
