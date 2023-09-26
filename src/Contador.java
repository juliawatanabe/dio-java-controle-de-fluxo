import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número inteiro: ");
            int numeroUm = terminal.nextInt();
            System.out.println("Digite o segundo número inteiro: ");
            int numeroDois = terminal.nextInt();

            try {
                contagem(numeroUm, numeroDois);
            } catch (Exception ParametrosInvalidosException) {
                System.out.println("O segundo número deve ser maior que o primeiro.");
            }
        }
    }

    static void contagem(int numeroUm, int numeroDois) throws ParametrosInvalidosException{
        if (numeroUm > numeroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int vezesIteracao = numeroDois - numeroUm;
            for (int inicio = 1; inicio <= vezesIteracao; inicio++) {
                System.out.println("Imprimindo o número " + inicio);
            }
        }
    }
}
