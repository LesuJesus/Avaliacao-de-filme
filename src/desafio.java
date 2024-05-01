import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        System.out.println("Lesu diga sua nota para o filme: ");
        double lesuNota = notas.nextDouble();
        System.out.println("Nezz diga sua nota para o filme: ");
        double nezzNota = notas.nextDouble();
        double filmeNota = (lesuNota + nezzNota) / 2;
        String mensagem = "A nota do filme é: " + filmeNota;

        System.out.println(mensagem);

        if (filmeNota >= 8.0) {
            System.out.println("Excelente");
        } else if (filmeNota < 8.0 && filmeNota >= 6.0) {
            System.out.println("Bom");
        } else if (filmeNota < 6.0 && filmeNota >= 4.0) {
            System.out.println("Médio");
        } else {
            System.out.println("Ruim");
        }
    }
}
