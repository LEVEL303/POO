public class EventoDelegacao {
    private String evento;
    private DataHora dataHora;
    
    public EventoDelegacao(String evento, int hora, int minutos, int dia, int mes, int ano) {
        this.dataHora = new DataHora(hora, minutos, dia, mes, ano);
        this.evento = evento;
    }

    public String toString() {
        return evento + " em " + dataHora.toString();
    }
}
