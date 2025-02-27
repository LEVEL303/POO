public class DemoLampada {
    public static void main(String[] args) {
        Lampada l = new Lampada();

        l.mostraEstado();
        
        l.acende(); 
        l.mostraEstado();
        l.apaga();

        l.acende();        
        l.acende();
        l.acende();
        l.acende();
        l.mostraEstado();

        l.apaga();
        l.mostraEstado();

        System.out.println(l.estaAcesa());
    }
}