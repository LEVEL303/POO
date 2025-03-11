import java.util.Scanner;

public class DemoExtrato {
    public static void main(String[] args) {
        Extrato extrato = new Extrato();
        Scanner sc = new Scanner(System.in);
        int opcao;
        float valor;

        do {
            System.out.println("0 - Depositar");
            System.out.println("1 - Sacar");
            System.out.println("2 - Ver extrato");
            System.out.println("3 - Encerrar");
            
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0:
                    System.out.print("Valor: ");
                    valor = sc.nextFloat();
                    extrato.transacao(valor);
                    break;
                case 1:
                    System.out.print("Valor: ");
                    valor = sc.nextFloat();
                    extrato.transacao(-valor);
                    break;
                case 2:
                    extrato.verExtrato();
                    break;
                case 3:
                    System.out.println("Encerrando...");
                    break; 
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 3);

        sc.close();
    }
}