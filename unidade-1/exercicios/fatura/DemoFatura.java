public class DemoFatura {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura();

        fatura1.inicializarFatura(23, "Teclado", -4, 36.0f);
        fatura1.exibirFatura();
    }
}