import java.util.ArrayList;

public class Extrato {
    private float saldoFinal;
    private ArrayList<Float> transacoes;

    public Extrato() {
        this.saldoFinal = 0.0F;
        this.transacoes = new ArrayList<>();
    }

    public void transacao(float valor) {
        if (saldoFinal + valor < 0) {
            System.out.println("Saque não realizado!");
        } else {
            saldoFinal += valor;
            transacoes.add(valor);
        }
    }

    public void verExtrato() {
        System.out.println("==================");
        for (float transacao : transacoes) {
            System.out.println(transacao);
        }
        System.out.println("Saldo Final: " + saldoFinal);
        System.out.println("==================");
    }
}