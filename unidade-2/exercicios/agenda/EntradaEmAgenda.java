public class EntradaEmAgenda {
    private String hora;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;

    public EntradaEmAgenda(String hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    public String toString() {
        String res = "";
        res += "Hora: " + hora + ", Data: " + dia + '/' + mes + '/' + ano + '\n';
        res += "Assunto: " + assunto;
        return res;
    }

    public boolean ehNoDia(int dia, int mes, int ano) {
        return (this.dia == dia && this.mes == mes && this.ano == ano);
    }
}