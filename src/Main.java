import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int numUsuario = 0;

        System.out.println("Digite um número inteiro entre 0 e 100 para o adivinhar: ");

        for (int i = 1; i <= 5; i++) {
            System.out.println("\n Digite o número: ");
            numUsuario = leitura.nextInt();
            if (numUsuario == numAleatorio){
                System.out.println("Parabéns! Você acertou!");
                break;
            }else{
                if (i == 5){
                    System.out.println("Tentativas excedidas! Você perdeu! O número era: " + numAleatorio);
                    break;
                }
                if (numAleatorio > numUsuario){
                    System.out.println("Para adivinhar o número deverá ser maior");
                }else {
                    System.out.println("Para adivinhar o número deverá ser menor");
                }
            }
        }
    }
}