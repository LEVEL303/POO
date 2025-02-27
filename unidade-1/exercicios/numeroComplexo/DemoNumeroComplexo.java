public class DemoNumeroComplexo {
    public static void main(String[] args) {
        NumeroComplexo n1 = new NumeroComplexo(2, 4);
        NumeroComplexo n2 = new NumeroComplexo(7);
        NumeroComplexo n3 = new NumeroComplexo();

        System.out.println("n1: " + n1.toString());
        System.out.println("n2: " + n2.toString());
        System.out.println("n3: " + n3.toString());
    }
}