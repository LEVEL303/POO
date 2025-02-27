public class DemoElevador {
    public static void main(String[] args) {
        Elevador elevador1 = new Elevador(3, 2);

        elevador1.sai();
        elevador1.entra();
        elevador1.entra();
        elevador1.entra();

        elevador1.desce();
        elevador1.sobe();
        elevador1.sobe();
        elevador1.sobe();
    }
}
