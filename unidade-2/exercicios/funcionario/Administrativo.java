public class Administrativo extends Assistente {
    private String turno;
    private float adicionalNoturno;

    public Administrativo(String nome, float salario, String numeroDeMatricula, float adicionalNoturno) {
        super(nome, salario, numeroDeMatricula);
        this.turno = "Noturno";
        this.adicionalNoturno = adicionalNoturno;
    }

    public Administrativo(String nome, float salario, String numeroDeMatricula) {
        super(nome, salario, numeroDeMatricula);
        this.turno = "Matutino";
        this.adicionalNoturno = 0.0F;
    }

    public float ganhoAnual() {
        return super.ganhoAnual() + adicionalNoturno * 12;
    }

    public String toString() {
        return super.toString() + "; Turno: " + turno + "; Adicional Noturno: " + adicionalNoturno;
    }
}
