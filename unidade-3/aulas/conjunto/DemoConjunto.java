import java.util.TreeSet;

public class DemoConjunto {
    public static void main(String[] args) {
        TreeSet<String> conjunto = new TreeSet<>();
        conjunto.add("preto");
        conjunto.add("rosa");
        conjunto.add("branco");
        conjunto.add("amarelo");
        conjunto.add("laranja");
        conjunto.add("verde");
        conjunto.add("vermelho");
        conjunto.add("vermelho");
        System.out.println(conjunto);
        System.out.println(conjunto.headSet("preta"));
        System.out.println(conjunto.tailSet("preta"));
        System.out.println(conjunto.first());
        System.out.println(conjunto.last());
    }
}
