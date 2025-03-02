public class RegistroAcademico {
    private static int numeroDeMatriculas = 0;
    private String nome;
    private String matricula;

    public RegistroAcademico(String nome) {
        numeroDeMatriculas++;
        this.nome = nome;
        this.matricula = "2025" + numeroDeMatriculas; 
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public static int getNumeroDeMatriculas() {
        return numeroDeMatriculas;
    }
}
