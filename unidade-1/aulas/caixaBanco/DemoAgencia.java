public class DemoAgencia {
    public static void main(String[] args) {
        System.out.println(CaixaBanco.clientesAntedidos);

        CaixaBanco c1 = new CaixaBanco(1);
        CaixaBanco c2 = new CaixaBanco(2);
        CaixaBanco c3 = new CaixaBanco(3);
        CaixaBanco c4 = new CaixaBanco(4);
        CaixaBanco c5 = new CaixaBanco(5);

        c1.iniciaAtendimento();
        c2.iniciaAtendimento();
        c3.iniciaAtendimento();
        c4.iniciaAtendimento();
        c5.iniciaAtendimento();

        System.out.println(CaixaBanco.clientesAntedidos);
    }
}