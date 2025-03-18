public class DemoControle {
    public static void main(String[] args) {
        Aviao a = new Aviao(42, "oj0987", "qwr-podr");
        Barco b = new Barco(20, 25.0F, "sas6633");
        Carro c = new Carro(5, 4, "qed1097");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a.moverFrente();
        b.moverFrente();
        c.moverFrente();

        Controle.controlar(a);
        Controle.controlar(b);
        Controle.controlar(c);
    }
}