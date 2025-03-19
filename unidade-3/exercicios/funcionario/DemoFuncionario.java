public class DemoFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Pedro");
        Funcionario f2 = new Funcionario("Tiago", 3.5F, 6);

        System.out.println(f1);
        System.out.println("Salario por dia: R$" + f1.salarioPorDia());
        System.out.println(f2);
        System.out.println("Salario por dia: R$" + f2.salarioPorDia());
    }
}