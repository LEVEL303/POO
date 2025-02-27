public class Lampada {
    private boolean estadoDaLampada;
    private Contador contadorAcesa;

    public Lampada() {
        estadoDaLampada = false;
        contadorAcesa = new Contador();
    }

    public void acende() {
        if(!estaAcesa()) {
            estadoDaLampada = true;
            contadorAcesa.incrementarContador();
        }
    }

    public void apaga() {
        estadoDaLampada = false;
    }

    public void mostraEstado() {
        if(this.estaAcesa()) {
            System.out.println("A lampada está acesa");
            System.out.print("Vezes acesas: ");
            contadorAcesa.imprimirContador();
        } else {
            System.out.println("A lampada está apagada");
        }
    }

    public boolean estaAcesa() {
        return estadoDaLampada;
    }
}