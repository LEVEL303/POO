import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Consultorio {
    public static void main(String[] args) {
        Queue<Paciente> filaPrioritaria = new LinkedList<>();
        Queue<Paciente> filaComum = new LinkedList<>();
        Random rd = new Random();
        Paciente paciente;
        int rg, idade, pacientesAtendidos = 0, minutos = 0;

        while(pacientesAtendidos < 20) {
            if (minutos % 4 == 0) {
                rg = rd.nextInt(900000) + 100000;
                idade = rd.nextInt(100) + 1;
                paciente = new Paciente(rg, idade);

                if (idade > 60) {
                    filaPrioritaria.offer(paciente);
                } else {
                    filaComum.offer(paciente);
                }
                System.out.println("Novo Paciente: " + paciente.toString());
            }

            if (minutos % 5 == 0 && minutos > 0) {
                if (!filaPrioritaria.isEmpty()) {
                    System.out.println("Paciente atentido: \n" + filaPrioritaria.poll());                pacientesAtendidos++;
                } else if (!filaComum.isEmpty()) {
                    System.out.println("Paciente atentido: \n" + filaComum.poll());                pacientesAtendidos++;
                } 
            }
            minutos++;
        }
    }       
}