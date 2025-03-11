public class DemoAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.addCompromisso("12:00", 11, 07, 2004, "Meu aniversário");
        agenda.addCompromisso("13:30", 11, 07, 2004, "Viagem");

        agenda.listaDia(11, 07, 2004);
    }
}