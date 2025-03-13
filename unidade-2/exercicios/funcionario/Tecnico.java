public class Tecnico extends Assistente {
    private float bonusSalarial;

    public Tecnico(String nome, float salario, String numeroDeMatricula, float bonusSalarial) {
        super(nome, salario, numeroDeMatricula);
        this.bonusSalarial = bonusSalarial;
    }

    public float ganhoAnual() {
        return  super.ganhoAnual() + bonusSalarial * 13;
    }

    public String toString() {
        return super.toString() + "; Bonus salarial: " + bonusSalarial;
    }
}
