public class DemoGenerica {
    public static void main(String[] args) {
        Generica <Integer> obj = new Generica<>(1,2,3);

        System.out.println(obj.quantIguais() +" são iguais");
    }
}