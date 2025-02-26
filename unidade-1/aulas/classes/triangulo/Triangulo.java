public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String desc;

    public void inicializaTriangulo(double l1, double l2, double l3, String d) {
        lado1 = l1;
        lado2 = l2;
        lado3 = l3
        desc = d;
    }

    public double perimetro() {
        return lado1 + lado2 + lado3;
    }
}