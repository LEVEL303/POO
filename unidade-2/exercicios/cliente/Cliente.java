public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String telefone;
    
    public Cliente(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public void imprimirCliente() {
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Telefone: " + telefone);
    }
}
