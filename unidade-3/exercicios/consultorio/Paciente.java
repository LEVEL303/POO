public class Paciente{
    private int rg;
    private int idade;

    public Paciente(int rg, int idade) {
        this.rg = rg;
        this.idade = idade;
    }

    public String toString() {
        return "RG: " + rg + "; Idade: " + idade;
    }
}