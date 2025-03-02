public class Fatura {
    private int numeroId;
    private String desc;
    private int quant;
    private float precoUni;

    public void inicializarFatura(int id, String d, int q, float p) {
        numeroId = id;
        desc = d;
        quant = (q > 0) ? q : 0;
        precoUni = (p > 0) ? p : 0.0f;
    }

    public float calculaTotal() {
        return quant * precoUni;
    }

    public void exibirFatura() {
        System.out.println("Numero de identificação: " + numeroId);
        System.out.println("Descrição: " + desc);
        System.out.println("Quantidade: " + quant);
        System.out.println("Preco Unitario: " + precoUni);
        System.out.println("Total: " + calculaTotal());
    }
}