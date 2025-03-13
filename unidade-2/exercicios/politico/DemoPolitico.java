public class DemoPolitico {
    public static void main(String[] args) {
        Prefeito p = new Prefeito("Fulano", 34, "P", "Vicosa");
        Governador g = new Governador("Sicrano", 45, "X", "Rio Grande do Norte");

        System.out.println(p.toString());
        System.out.println(g.toString());
    }    
}
