import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int attempts = 1;

        int numb_random = random.nextInt(100); // Gera um número aleatório entre 0 e 100.
        String data_user;
        int new_data;

        while (attempts <= 10) {
            System.out.println("Bem-vindo ao Jogo da Adivinhação! Tente descobrir um número inteiro entre 0 e 100. Tentativa: " + attempts + "/10");
            data_user = scan.nextLine();

            try {
                new_data = Integer.parseInt(data_user);

                if (new_data == numb_random) {
                    System.out.println("Parabéns! Você acertou o número secreto. O número era: ");
                    break; 
                } else if (new_data > 100) {
                    System.out.println("Por favor, insira um número válido.");
                } else {
                    System.out.println("Tente novamente!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
            }

            attempts++;
        }

        if (attempts > 10) {
            System.out.println("Você atingiu o número máximo de tentativas. O número secreto era: " + numb_random);
        }

        scan.close();
    }
}
