public class Aluno {
    private String matricula;
    private String nome;
    private float prova1;
    private float prova2;
    private float trabalho;

    Aluno(String matricula, String nome, float prova1, float prova2, float trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.prova1 = (prova1 < 0) ? 0.0f : prova1;
        this.prova2 = (prova2 < 0) ? 0.0f : prova2;
        this.trabalho = (trabalho < 0) ? 0.0f : trabalho;
    }

    public float media() {
        return (prova1 * 2.5f + prova2 * 2.5f + trabalho * 2) / 7;
    }

    public float provaFinal() {
        float mediaParcial = this.media();

        if (mediaParcial < 3 || mediaParcial >= 7) {
            return 0.0f;
        } else {
            return (50 - mediaParcial * 6) / 4;
        }
    }
}