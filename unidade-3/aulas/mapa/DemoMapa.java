import java.util.TreeMap;

public class DemoMapa {
    public static void main(String[] args) {
        TreeMap<String, Integer> contador = new TreeMap<>();
        String texto = "Sun Tree Heart Mountain Orange Clock Ocean Bird Mystery Star Book Freedom Coffee Key Sunset Music Car Dream Friendship Mystery Star Book Freedom Coffee Key Garden Sky River Apple Flower Night Moon Laptop Rainbow Ocean Happiness Cloud Garden Sky River Apple Flower Night Moon Laptop Rainbow Ocean Happiness Cloud Sunset Garden Sky River Apple Flower Night Moon Laptop Rainbow Ocean Happiness Cloud Waterfall Elephant Fire Coffee Ice Ball Table Chair Lamp Journey Music Dream Love Peace Game Adventure";
        String[] palavras = texto.split(" ");

        for(String palavra : palavras) {
            String palavraMin = palavra.toLowerCase();
            if(!contador.containsKey(palavraMin)) {
                contador.put(palavraMin, 1);
            } else {
                int valor = contador.get(palavraMin);
                contador.put(palavraMin, valor + 1);
            }
        }

        for(String palavra : contador.keySet()) {
            System.out.println(palavra + " " + contador.get(palavra));
        }
    }
}
