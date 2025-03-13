public class Teste {
    public static void main(String[] args) {
        Livro l1 = new Livro("O Hobbit", "J.R.R Tolkien", 1937);
        LivroLivraria l2 = new LivroLivraria("Crime e Castigo", "Fiodor Dostoievski", 1866, 83.71F);
        LivroBiblioteca l3 = new LivroBiblioteca("Os Miseraveis", "Victor Hugo", 1862, true);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
