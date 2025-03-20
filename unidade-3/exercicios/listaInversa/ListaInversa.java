import java.util.LinkedList;

public class ListaInversa {
    public static void main(String[] args) {
        LinkedList<Character> lista = new LinkedList<>();
        LinkedList<Character> copia = new LinkedList<>();

        lista.add('a');
        lista.add('b');
        lista.add('c');
        lista.add('d');
        lista.add('e');
        lista.add('f');
        lista.add('g');
        lista.add('h');
        lista.add('i');
        lista.add('j');

        System.out.println(lista);

        for(int i = (lista.size() - 1); i >= 0; i--) {
            copia.add(lista.get(i));
        }

        System.out.println(copia);
    }
}
