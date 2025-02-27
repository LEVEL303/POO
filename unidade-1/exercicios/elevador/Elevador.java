public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int quantPessoas;
    private int capacidade;

    Elevador(int totalAndares, int capacidade) {
        this.totalAndares = (totalAndares > 0) ? totalAndares : 2;
        this.capacidade = (capacidade > 0) ? capacidade : 1;
        this.andarAtual = 1;
        this.quantPessoas = 0;
    }

    public void entra() {
        if(quantPessoas < capacidade) {
            quantPessoas++;
        } else {
            System.out.println("Capacidade máxima já atingida!");
        }
    }

    public void sai() {
        if(quantPessoas > 0) {
            quantPessoas--;
        } else {
            System.out.println("O Elevador está vazio!");
        }
    }

    public void sobe() {
        if(andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("O elevador está no último andar!");
        }
    }

    public void desce() {
        if(andarAtual > 1) {
            andarAtual--;
        } else {
            System.out.println("O elevador está no térreo!");
        }
    }
}