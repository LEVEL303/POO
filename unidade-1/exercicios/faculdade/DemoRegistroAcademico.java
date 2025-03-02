public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico aluno1 = new RegistroAcademico("Mateus");
        RegistroAcademico aluno2 = new RegistroAcademico("Marcos");
        RegistroAcademico aluno3 = new RegistroAcademico("Lucas");
        RegistroAcademico aluno4 = new RegistroAcademico("João");

        System.out.println("Nome: " + aluno1.getNome() + "\nMartícula: " + aluno1.getMatricula());
        System.out.println("Nome: " + aluno2.getNome() + "\nMartícula: " + aluno2.getMatricula());
        System.out.println("Nome: " + aluno3.getNome() + "\nMartícula: " + aluno3.getMatricula());
        System.out.println("Nome: " + aluno4.getNome() + "\nMartícula: " + aluno4.getMatricula());

        System.out.println("Número de matrículas: " + RegistroAcademico.getNumeroDeMatriculas());
    }
}
