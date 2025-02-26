public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();

        michael.inicializaRegistroAcademico("Michael", "12345", 2, 0.6f);
        System.out.println(michael.calculaMensalidade());
    }
}