public class RegistroAcademicoPosGraduacao {
    private RegistroAcademico registro;
    private String tituloTese;
    private String orientador;

    public RegistroAcademicoPosGraduacao(String nomeDoAluno, String matricula, String curso, String tituloTese, String orientador) {
        this.registro = new RegistroAcademico(nomeDoAluno, matricula, curso);
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    public RegistroAcademicoPosGraduacao(RegistroAcademico registro, String tituloTese, String orientador) {
        this.registro = registro;
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    public String toString() {
        return registro + "; Título da tese: " + tituloTese + "; Orientador: " + orientador; 
    }
}
