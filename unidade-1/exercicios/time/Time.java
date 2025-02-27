public class Time {
    private String nome;
    private String cidade;
    private int vitorias;
    private int derrotas;
    private int empates;    

    public void inicializarTime(String n, String c, int v, int d, int e) {
        nome = n;
        cidade = c;
        vitorias = v;
        derrotas = d;
        empates = e;
    }

    public void registrarVitoria() {
        vitorias++;
    }

    public void registrarDerrota() {
        derrotas++;
    }

    public void registrarEmpate() {
        empates++;
    }

    public void exibirDados() {
        System.out.println("Nome:" + nome);
        System.out.println("Cidade:" + cidade);
        System.out.println("Vitorias:" + vitorias + " Derrotas:" + derrotas + " Empates:" + empates);
    }
}