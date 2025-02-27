public class Contador {
    private int valor;

    public Contador() {
        valor = 0;
    }

    public void zerarContador() {
        valor = 0;
    }

    public void incrementarContador() {
        valor++;
    }

    public void imprimirContador() {
        System.out.println(valor);
    }
}