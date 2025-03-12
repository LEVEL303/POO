public class Produto {
    public static int produto(int... numeros) {
        int res = 1;
        for (int numero : numeros) {
            res *= numero;
        }
        return res;
    }
}