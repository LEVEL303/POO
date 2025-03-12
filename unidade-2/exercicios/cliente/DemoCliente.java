import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
    public static void main(String[] args) {
        ArrayList <Cliente> clientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int id, idade;
        String nome, telefone;

        while (true) {
            System.out.println("=== Dados do cliente ===");

            System.out.print("Id: ");
            id = sc.nextInt();
            sc.nextLine();

            if (id < 0) break;

            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Idade: ");
            idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Telefone: ");
            telefone = sc.nextLine();

            clientes.add(new Cliente(id, nome, idade, telefone));
        }

        for (Cliente cliente : clientes) {
            cliente.imprimirCliente();
        }

        sc.close();
    }
}
