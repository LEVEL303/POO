public class DemoContador {
    public static void main(String[] args) {
        Contador c = new Contador();

        c.imprimirContador(); 

        c.incrementarContador();
        c.incrementarContador();
        c.incrementarContador();
        c.incrementarContador();
        c.imprimirContador();

        c.zerarContador();
        c.imprimirContador();
    }
}