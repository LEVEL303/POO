class DemoTriangulo {
    public static void main(String[] args) {
        Triangulo t1, t2, t3;

        t1 = new Triangulo();
        t1.inicializaTriangulo(3, 4, 5, "Triangulo retangulo");

        t2 = new Triangulo();
        t2.inicializaTriangulo(3, 4, 5, "Triangulo retangulo");

        t3 = t1;
    }
}