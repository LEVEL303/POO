public class DemoFinanceiro {
    public static void main(String[] args) {
        Assalariado func = new Assalariado("Luiz", "069406", 2345.67F);
        Fatura fatura = new Fatura(123.45F, 5);

        imprimeCustoPagamento(func);
        imprimeCustoPagamento(fatura);
    }

    public static void imprimeCustoPagamento(Pagavel pagavel) {
        System.out.println("Valor do pagamento: " + pagavel.obeterValorPagamento());
    }
}