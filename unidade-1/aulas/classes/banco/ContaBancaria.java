public class ContaBancaria {
    private String nome;
    private float saldo;
    private boolean especial;

    public ContaBancaria(String nome, float saldo, boolean especial) {
        this.nome = nome;
        this.saldo = saldo;
        this.especial = especial;
    }

    
    public ContaBancaria(String nome, float saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.especial = false;
    }

    
    public ContaBancaria(String nome) {
        this.nome = nome;
        this.saldo = 0.0f;
        this.especial = false;
    }

    public String toString() {
        String res = "";
        res += "Correstista: " + nome + "\n";
        res += "Saldo: " + saldo + "\n";
        res += (especial ? "Conta especial" : "Conta comum");
        return res;
    }
}