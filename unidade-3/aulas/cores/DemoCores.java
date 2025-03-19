import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoCores {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>(Arrays.asList("rosa", "laranja", "roxo"));
        String[] novasCores = {"preto", "cinza", "verde", "vermelho"};
        cores.add("branco");
        cores.addAll(Arrays.asList(novasCores));
        Collections.sort(cores);

        System.out.println(cores);

        buscaAlvo(cores, "branco");
        buscaAlvo(cores, "marrom");
    }

    public static void buscaAlvo(ArrayList<String> lista, String alvo) {
        if(lista.contains(alvo)) {
            int posicao = Collections.binarySearch(lista, alvo);
            System.out.println(alvo + " estah na posicao: " + posicao);
        } else {
            System.out.println("Nao estah na lista");
        }
    }
}
