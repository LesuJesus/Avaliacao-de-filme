public class desafio {
    public static void main(String[] args) {
        double lesuNota = 4.0;
        double maeNota = 3.0;
        double filmeNota = (lesuNota + maeNota) / 2;
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
