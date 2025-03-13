public class Equipamento {
    private int codigo;
    private String nome;
    
    public Equipamento(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Código: " + codigo + "; Nome: " + nome;
    }
}
