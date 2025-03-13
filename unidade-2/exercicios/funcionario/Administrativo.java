public class Administrativo extends Assistente {
    private float adicionalNoturno;

    public Administrativo(String nome, float salario, String numeroDeMatricula, float adicionalNoturno) {
        super(nome, salario, numeroDeMatricula);
        this.adicionalNoturno = adicionalNoturno;
    }

    public float ganhoAnual() {
        return super.ganhoAnual() + adicionalNoturno * 12;
    }

    public String toString() {
        return super.toString() + "; Adicional Noturno: " + adicionalNoturno;
    }
}
