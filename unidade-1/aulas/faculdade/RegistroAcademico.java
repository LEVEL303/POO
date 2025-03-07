public class RegistroAcademico {
    private String nome;
    private String matricula;
    private int codigoCurso;
    private float percentualDeCobranca;

    public void inicializaRegistroAcademico(String n, String m, int c, float p) {
        nome = n;
        matricula = m;
        codigoCurso = c;
        percentualDeCobranca = p;
    }

    public float calculaMensalidade() {
        return 100 * codigoCurso * percentualDeCobranca;
    }
}