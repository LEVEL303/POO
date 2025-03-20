public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean emprestado;
    private String localizacao;
    private String descricao;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao, String localizacao, String descricao) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.emprestado = false;
        this.localizacao = localizacao;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        String res = super.toString() + '\n';
        res += "Descricao: " + descricao + '\n';
        res += "Localizacao: " + localizacao + '\n';
        res += "Estado atual: " + (emprestado ? "Emprestado" : "Disponivel");

        return res;
    }

    public boolean estaEmprestado() {
        return emprestado;
    }

    public void empresta() {
        emprestado = true;
    }

    public void devolve() {
        emprestado = false;
    }

    public String localizacao() {
        return localizacao;
    }

    public String descricao() {
        return descricao;
    }
}
