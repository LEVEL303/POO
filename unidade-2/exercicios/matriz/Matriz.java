public class Matriz {
    private float[][] valores;
    
    public Matriz(float a, float b, float c, float d) {
        valores = new float[][] {{a, b}, {c, d}};
    }

    public float determinate() {
        return valores[0][0] * valores[1][1] - valores[1][0] * valores[0][1];
    }

    public void imprimirMatriz() {
        for (float[] linha : valores) {
            for (float valor : linha) {
                System.out.print(valor + "  ");
            }
            System.out.println();
        }
    }
}
