public class DemoMatriz {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(5.0F, 2.5F, 3.0F, 4.5F);

        matriz.imprimirMatriz();
        System.out.println("Determinante: " + matriz.determinate());
    }    
}
