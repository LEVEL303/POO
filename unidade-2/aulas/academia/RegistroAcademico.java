public class RegistroAcademico {
    private String nomeDoAluno;
    private String matricula;
    private String curso;

    public RegistroAcademico(String nomeDoAluno, String matricula, String curso) {
        this.nomeDoAluno = nomeDoAluno;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String toString() {
        return "Nome: " + nomeDoAluno + "; Matrícula: " + matricula + "; Curso: " + curso;
    }
}