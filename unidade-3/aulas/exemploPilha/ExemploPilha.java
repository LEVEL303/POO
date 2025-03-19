import java.util.Stack;

public class ExemploPilha {
    public static void main(String[] args) {
        Stack<Number> pilha = new Stack<>();
        
        pilha.push(10);
        System.out.println(pilha);
        pilha.push(Math.PI);
        System.out.println(pilha);
        pilha.push(1.41F);
        System.out.println(pilha);

        System.out.println(pilha.pop() + " removido");
        System.out.println(pilha.pop() + " removido");
        System.out.println(pilha.pop() + " removido");
    }
}