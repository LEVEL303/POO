public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        String descricao = "Uma historia de aventura.";
        LivroDeBiblioteca l1 = new LivroDeBiblioteca("O Hobbit", "J.R.R. Tolkien", 350, 2024, "corredor 2, prateleira D", descricao);

        l1.empresta();
        System.out.println(l1);
        l1.devolve();

        System.out.println("Titulo: " + l1.qualTitulo() + "; Autor: " + l1.qualAutor());
        System.out.println(l1.estaEmprestado() ? "Esta emprestado" : "Esta disponivel");
        System.out.println("Localizacao: " + l1.localizacao());
        System.out.println("Descricao: " + l1.descricao());
    }
}
