public class Principal {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        Quadrado q = new Quadrado();
        Triangulo t = new Triangulo();

        Desenho d1 = new Desenho(c, q, 5, 8, 10,8);
        Desenho d2 = new Desenho(q, t, 2, 4, 2, 4);

        d1.apresenta();
        d2.apresenta();
    }
}