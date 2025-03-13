public class LivroLivraria extends Livro{
    private float preco;

    public LivroLivraria(String titulo, String autor, int anoPublicacao, float preco) {
        super(titulo, autor, anoPublicacao);
        this.preco = preco;
    }

    @Override
    public String toString() {
        return super.toString() + "; Preco: R$" + preco;
    }
}
