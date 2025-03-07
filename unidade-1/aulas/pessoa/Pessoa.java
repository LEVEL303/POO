public class Pessoa {
    private String nome;
    private float altura;

    Pessoa(String nome, float altura) {
        setNome(nome);
        setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        if(!novoNome.isEmpty()) {
            nome = novoNome;
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float novaAltura) {
        if(novaAltura > 0) {
            altura = novaAltura;
        }
    }

    public String toString() {
        return "Nome: " + nome + "; Altura: " + altura;
    }
}