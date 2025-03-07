public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Levitico", 1.7f);

        System.out.println(p.getNome());
        p.setNome("");
        System.out.println(p.getNome());

        System.out.println(p.getAltura());
        p.setAltura(1);
        System.out.println(p.getAltura());

        System.out.println(p);
    }
}