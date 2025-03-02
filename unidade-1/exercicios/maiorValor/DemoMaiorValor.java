public class DemoMaiorValor {
    public static void main(String[] args) {
        System.out.println(MaiorValor.maior(5, 9));
        System.out.println(MaiorValor.maior(7, 10, 8));
        System.out.println(MaiorValor.maior(15, 3, 8, 1));
        System.out.println(MaiorValor.maior(5, 6, 4, 1, 3));   

        System.out.println(MaiorValor.maior(6.2, 6.15));
        System.out.println(MaiorValor.maior(9.9, 10, 7.5));
        System.out.println(MaiorValor.maior(22.2, 3.3, 80, 10));
        System.out.println(MaiorValor.maior(3.5, 1.2, 2.90, 3.68, 3.7)); 
    }
}