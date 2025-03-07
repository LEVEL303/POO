public class DemoBanco {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Levitico");
        System.out.println(c1);

        ContaBancaria c2 = new ContaBancaria("Pedro", 1000, true);
        System.out.println(c2);
    }
}