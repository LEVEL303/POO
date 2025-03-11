import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nLinhas;

        System.out.print("Quantidade de linhas: ");
        nLinhas = sc.nextInt();

        int[][] triangulo = new int[nLinhas][];

        for (int i = 0; i < nLinhas; i++) {
            triangulo[i] = new int[i + 2];
            triangulo[i][0] = 1;
            triangulo[i][i + 1] = 1;

            for (int j = 1; j < (i + 1); j++) {
                triangulo[i][j] = triangulo[i - 1][j] + triangulo[i - 1][j - 1];
            }
        }

        for (int i = 0; i < triangulo.length; i++) {
            for (int j = 0; j < triangulo[i].length; j++) {
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}