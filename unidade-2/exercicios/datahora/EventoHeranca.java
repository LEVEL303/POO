public class EventoHeranca extends DataHora{
    private String evento;

    public EventoHeranca(String evento, int hora, int minutos, int dia, int mes, int ano) {
        super(hora, minutos, dia, mes, ano);
        this.evento = evento;
    }

    public String toString() {
        return evento + " em " + super.toString();
    }
}   
