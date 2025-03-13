public class DataHora {
    private int hora;
    private int minutos;
    private int dia;
    private int mes;
    private int ano;

    public DataHora(int hora, int minutos, int dia, int mes, int ano) {
        this.hora = hora;
        this.minutos = minutos;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano + " " + hora + ":" + minutos;
    }
}   
