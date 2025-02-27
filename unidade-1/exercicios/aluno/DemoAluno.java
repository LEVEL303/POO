public class DemoAluno {
    public static void main(String[] args) {
        Aluno levitico = new Aluno("123", "levitico", 7.0f, 6.0f, 7.0f);
        float exameFinal = levitico.provaFinal();

        if(exameFinal == 0) {
            System.out.println("Nao precisa realizar o exame final.");
        } else {
            System.out.println("Nota necessária no exame final: " + exameFinal);
        }
        
    }
}