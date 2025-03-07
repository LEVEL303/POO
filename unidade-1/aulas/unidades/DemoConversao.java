public class DemoConversao {
    public static void main(String[] args) {
        System.out.println("3.5 polegadas = " + ConversaoUnidades.polegadasParaCentimetros(3.5f) +" centimetros");
        System.out.println("3.5 pes = " + ConversaoUnidades.pesParaCentimetros(3.5f) + " centimetros");
        System.out.println("3.5 milhas = " + ConversaoUnidades.milhasParaQuilometros(3.5f) + " quilometros");
    }
}