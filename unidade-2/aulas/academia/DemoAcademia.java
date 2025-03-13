public class DemoAcademia {
    public static void main(String[] args) {
        RegistroAcademicoPosGraduacao reg1 = new RegistroAcademicoPosGraduacao("Lucas", "1234567", "Egenharia elétrica", "Sinais elétricos", "Natanael");
        System.out.println(reg1);

        RegistroAcademico registro = new RegistroAcademico("Mateus", "756214", "Engenharia de software");
        RegistroAcademicoPosGraduacao reg2 = new RegistroAcademicoPosGraduacao(registro, "Usabilidade do SIGAA", "Fernando");
        System.out.println(reg2);
    }
}
