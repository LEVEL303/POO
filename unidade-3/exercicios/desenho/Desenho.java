public class Desenho {
    private FiguraGeometrica fg1;
    private FiguraGeometrica fg2;
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Desenho(FiguraGeometrica fg1, FiguraGeometrica fg2, int x1, int y1, int x2, int y2) {
        this.fg1 = fg1;
        this.fg2 = fg2;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void apresenta() {
        System.out.println("Figura Geometrica 1:");
        System.out.println("Coordenadas: X = " + x1 + "; Y = " + y1);
        fg1.descricao();
        
        System.out.println("Figura Geometrica 2:");
        System.out.println("Coordenadas: X = " + x2 + "; Y = " + y2);
        fg2.descricao();
    }
}