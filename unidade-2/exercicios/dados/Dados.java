import java.util.Random;

public class Dados {
    public static void main(String[] args) {
        Random random = new Random();
        int dado1;
        int dado2;
        int[] vezes = new int[11];

        for (int i = 0; i < 36000000; i++) {
            dado1 = random.nextInt(6) + 1;
            dado2 = random.nextInt(6) + 1;
            vezes[(dado1 + dado2) - 2]++;
        }

        for (int i = 0; i < vezes.length; i++) {
            System.out.println("Soma = " + (i + 2) + ": " + vezes[i] + " vezes");
        }
    }
}