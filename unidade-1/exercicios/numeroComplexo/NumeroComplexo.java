public class NumeroComplexo {
    private double parteReal;
    private double parteImaginaria;

    public NumeroComplexo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public NumeroComplexo(double parteReal) {
        this.parteReal = parteReal;
        this.parteImaginaria = 0;
    }

    public NumeroComplexo() {
        this.parteReal = 0;
        this.parteImaginaria = 0;
    }

    public String toString() {
        return parteReal + " + " + parteImaginaria + "i";
    }
}