import java.util.Stack;

public class Balanceado {
    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();
        String texto = "(()))";
        char[] parenteses = texto.toCharArray();

        for(char parentese : parenteses) {
            if (parentese == '(') {
                pilha.push(parentese);
            } else if (!pilha.isEmpty()) {
                pilha.pop();
            } else {
                pilha.push(parentese); 
                break;
            }
        }

        if(pilha.isEmpty()) {
            System.out.println(texto + " Esta balanceado");
        } else {
            System.out.println(texto + " Nao esta balanceado");
        }
    }
}