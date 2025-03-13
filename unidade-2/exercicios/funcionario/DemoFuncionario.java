public class DemoFuncionario {
    public static void main(String[] args) {
        Tecnico t = new Tecnico("Pedro", 1200.0F, "123", 100.0F);
        Administrativo a = new Administrativo("Lucas", 1300.0F, "456", 200.0F);

        System.out.println(t);
        System.out.println("Ganho Anual: " + t.ganhoAnual());
        System.out.println(a);
        System.out.println("Ganho Anual: " + a.ganhoAnual());
    }    
}
