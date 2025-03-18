public abstract class Aereo extends Veiculo {
    private String cadANAC;

    public Aereo(int capacidade, String cadANAC) {
        super(capacidade);
        this.cadANAC = cadANAC;
    }

    public String toString() {
        return super.toString() + "; cadANAC: " + cadANAC;
    }
}