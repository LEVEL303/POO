public class DemoEmpresa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Daniel", "546889");
        Funcionario f = new Funcionario("João", "123456", 1518.0F);
        ChefeDeDepartamaneto c = new ChefeDeDepartamaneto("Julio", "987564", 5200F, "Vendas");

        System.out.println(p);
        System.out.println(f);
        System.out.println(c);
    }    
}
