public abstract class Veiculo {
    private int capacidade;

    public Veiculo(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract void moverFrente();

    public String toString() {
        return "Capacidade: " + capacidade;
    }
} 