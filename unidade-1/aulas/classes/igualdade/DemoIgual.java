public class DemoIgual {
    public static void main(String[] args) {
        if(Igual.ehIgual(2.3, 2.3)) {
            System.out.println("São iguais");
        } else {
            System.out.println("Não são iguais");
        }
        if(Igual.ehIgual("carro", "carro")) {
            System.out.println("São iguais");
        } else {
            System.out.println("Não são iguais");
        }
        if(Igual.ehIgual(2, 3)) {
            System.out.println("São iguais");
        } else {
            System.out.println("Não são iguais");
        }
    }
}