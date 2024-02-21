import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int attempts = 1;
        int numb_random = random.nextInt(100); // Gera um número aleatório entre 0 e 100.
        
        while (attempts <= 10) {
            System.out.println("Bem-vindo ao Jogo da Adivinhação! Tente descobrir um número inteiro entre 0 e 100. Tentativa: " + attempts + "/10");
            try {
                if (scan.hasNextInt()) {
                    int data_user = scan.nextInt();
                    
                    if (data_user == numb_random) {
                        System.out.println("Parabéns! Você acertou o número secreto. O número era: " + numb_random + ".");
                        break; 
                    } else if (data_user > 100) {
                        System.out.println("Por favor, insira um número válido entre 0 e 100.");
                    } else {
                        System.out.println("Tente novamente!");
                    }
                } else {
                    System.out.println("Por favor, insira um número válido.");
                    break;
                }
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("[ERRO] Insira um número válido!");
            }
            attempts++;
        }

        if (attempts > 10) {
            System.out.println("Você atingiu o número máximo de tentativas. O número secreto era: " + numb_random);
        }
        scan.close();
    }
}
