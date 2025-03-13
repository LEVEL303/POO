public class AutomovelDeLuxo extends AutomovelBasico{
    private boolean arCondicionado;
    private boolean direcaoHidraulica;

    public AutomovelDeLuxo(int ano, String modelo, String cor, boolean airbag, boolean radio, boolean arCondicionado, boolean direcaoHidraulica) {
        super(ano, modelo, cor, radio, airbag);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }

    @Override
    public float quantoCusta() {
        float custo = super.quantoCusta();

        if (arCondicionado) custo += 15000;
        if (direcaoHidraulica) custo += 17000;

        return custo;
    }

    public String toString() {
        String res = "";

        res += "Ano: " + ano;
        res += "; Modelo: " + modelo;
        res += "; Cor: " + cor;
        res += "; Airbag: " + getAirbag();
        res += "; Radio: " + getRadio();
        res += "; Ar condicionado: " + arCondicionado;
        res += "; Direcao Hidraulica: " + direcaoHidraulica;
        res += "; Custo: " + quantoCusta();

        return res;
    }
}
