public class Barco extends Aquatico {
    private String cadBarco;

    public Barco(int capacidade, float profundidade, String cadBarco) {
        super(capacidade, profundidade);
        this.cadBarco = cadBarco;
    }

    public void moverFrente() {
        System.out.println("Barco movendo para frente!");
    }

    public String toString() {
        return super.toString() + "; Cad Barco: " + cadBarco;
    }
}