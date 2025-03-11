import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> Agenda;

    public Agenda() {
        Agenda = new ArrayList<>();
    }

    public void addCompromisso(String hora, int dia, int mes, int ano, String assunto) {
        EntradaEmAgenda entrada = new EntradaEmAgenda(hora, dia, mes, ano, assunto);
        Agenda.add(entrada);
    }

    public void listaDia(int dia, int mes, int ano) {
        for (EntradaEmAgenda entrada : Agenda) {
            
            if (entrada.ehNoDia(dia, mes, ano)) {
                System.out.println(entrada.toString() + '\n');
            }
        }
    }
}