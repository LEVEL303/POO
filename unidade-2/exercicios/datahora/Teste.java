public class Teste {
    public static void main(String[] args) {
        EventoDelegacao evento1 = new EventoDelegacao("Aniverário", 10, 30, 6, 11, 2025);
        EventoHeranca evento2 = new EventoHeranca("Seminário", 13, 45, 12, 10, 2025);

        System.out.println(evento1);
        System.out.println(evento2);
    }
}
