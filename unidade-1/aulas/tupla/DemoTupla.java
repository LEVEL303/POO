public class DemoTupla {
    public static void main(String[] args) {
        Tupla <Double, String> t1 = new Tupla<>(2.3, "Teste");

        System.out.println(t1.getPri());
        System.out.println(t1.getSeg());

        Tupla <Integer, Boolean> t2 = new Tupla<>(2, true);

        System.out.println(t2.getPri());
        System.out.println(t2.getSeg());
    }
}