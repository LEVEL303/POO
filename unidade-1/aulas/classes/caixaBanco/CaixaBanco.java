class CaixaBanco {
    public static int clientesAntedidos = 0;
    private int numeroCaixa;

    CaixaBanco(int numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }

    public void iniciaAtendimento() {
       clientesAntedidos++;
       System.out.println("Caixa " + numeroCaixa + " atendeu o cliente: " + clientesAntedidos); 
    }
}