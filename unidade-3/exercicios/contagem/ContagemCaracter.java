import java.util.TreeMap;

public class ContagemCaracter {
    public static void main(String[] args) {
        TreeMap<Character, Integer> mapa = new TreeMap<>();
        String texto = "HELLO THERE";
        char[] caracteres = texto.toCharArray();

        for(char c : caracteres) {
            if(c != ' ') {
                if(!mapa.containsKey(c)) {
                    mapa.put(c, 1);
                } else {
                    int valor = mapa.get(c);
                    mapa.put(c, valor + 1);
                }
            }
        }

        for(char c : mapa.keySet()) {
            System.out.println(c + " " + mapa.get(c));
        }
    }
}
