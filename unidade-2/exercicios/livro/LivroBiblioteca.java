public class LivroBiblioteca extends Livro{
    private boolean disponibilidade;

    public LivroBiblioteca(String titulo, String autor, int anoPublicacao, boolean disponibilidade) {
        super(titulo, autor, anoPublicacao);
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String toString() {
        return super.toString() + "; Disponibilidade: " + (disponibilidade ? "Disponivel" : "Nao disponivel");
    }
}
