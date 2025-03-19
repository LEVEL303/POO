import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveLista {
    public static void main(String[] args) {
        LinkedList<String> listaCompleta = new LinkedList<>();
        LinkedList<String> listaRemocao = new LinkedList<>();

        listaCompleta.add("verde");
        listaCompleta.add("amarelo");
        listaCompleta.add("roxo");
        listaCompleta.add("preto");
        listaCompleta.add("laranja");
        listaCompleta.add("branco");

        System.out.println(listaCompleta);

        listaRemocao.add("branco");
        listaRemocao.add("roxo");
        listaRemocao.add("amarelo");

        System.out.println(listaRemocao);

        removeLista(listaCompleta, listaRemocao);
        System.out.println(listaCompleta);
    }

    public static void removeLista(LinkedList<String> listaCompleta, LinkedList listaRemocao) {
        ListIterator<String> itera = listaCompleta.listIterator();

        while (itera.hasNext()) {
            String elemento = itera.next();
            if(listaRemocao.contains(elemento)) {
                itera.remove();
                System.out.println("Elemento removido!");
            }
        }
    }
}