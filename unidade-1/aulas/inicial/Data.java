public class Data {
    private int dia;
    private int mes;
    private int ano;

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void mostraData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    static Data criaData(int dia, int mes, int ano) {
        if(dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano > 0) {
            return new Data(dia, mes, ano);
        } else {
            System.out.println("Data inválida");
            return null;
        }
    }
}