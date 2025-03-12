public class DemoProduto {
    public static void main(String[] args) {
        int p1 = Produto.produto(5, 4, 3, 2);
        int p2 = Produto.produto(2, 6);
        int p3 = Produto.produto(9, 8, 20);
        int p4 = Produto.produto(7, 5, 2, 1, 3);

        System.out.println("P1: " + p1 + " P2: " + p2 + " P3: " + p3 + " P4: " + p4);
    }
}