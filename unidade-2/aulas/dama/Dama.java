public class Dama {
    private static final int LINHAS = 8;
    private static final int COLUNAS = 8;
    private char[][] tabuleiro;

    public Dama() {
        tabuleiro = new char[LINHAS][COLUNAS];

        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {

                if ((i + j) % 2 == 0) {
                    tabuleiro[i][j] = '.';
                } else if (i < 3) {
                    tabuleiro[i][j] = 'o';
                } else if (i > 4) {
                    tabuleiro[i][j] = 'x';
                } else {
                    tabuleiro[i][j] = '.';
                }
            }
        }
    }

    public String toString() {
        String res = "";

        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                res += tabuleiro[i][j] + "  ";
            }
            res += '\n';
        }
        return res;
    }
}