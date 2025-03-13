public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento eq = new Equipamento(123, "Mouse");
        Computador pc = new Computador(456, "HP", "EliteDesk");

        System.out.println(eq.toString());
        System.out.println(pc.toString());
    }
}