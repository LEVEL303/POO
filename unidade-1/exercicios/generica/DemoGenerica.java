public class DemoGenerica {
    public static void main(String[] args) {
        Generica <Integer> obj1 = new Generica<>(1,2,3);

        obj1.imprimirAtributos();
        System.out.println(obj1.quantIguais() + " são iguais");

        Generica<String> obj2 = new Generica<>("Java", "Python", "Java");

        obj2.imprimirAtributos();
        System.out.println(obj2.quantIguais() + " são iguais");

        Generica <Double> obj3 = new Generica<>(2.0, 2.0, 2.0);

        obj3.imprimirAtributos();
        System.out.println(obj3.quantIguais() + " são iguais");
    }
}