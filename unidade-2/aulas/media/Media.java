public class Media {
    public static void main(String[] args) {
        System.out.println("Media: " + media(7.5, 6.5, 7.0));
    }

    public static double media(double... numeros) {
        double soma = 0.0;

        for (double numero : numeros) {
            soma += numero;
        }

        return soma / numeros.length;
    }
}