public class DemoTime {
    public static void main(String[] args) {
        Time time1 = new Time();

        time1.inicializarTime("Thunders", "Rio de Janeiro", 0, 0, 0);

        time1.registrarVitoria();
        time1.registrarVitoria();
        time1.registrarDerrota();
        time1.registrarVitoria();
        time1.registrarEmpate();

        time1.exibirDados();
    }
}