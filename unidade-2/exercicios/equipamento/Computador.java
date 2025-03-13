public class Computador extends Equipamento{
    private String marca;
    private String modelo;

    public Computador(int codigo, String marca, String modelo) {
        super(codigo, "Computador");
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    } 

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String toString() {
        return super.toString() + "; Marca: " + marca + "; Modelo: " + modelo;
    }
}
