import java.util.Random;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome");

        String name = scanner.nextLine();

        System.out.println("Olá " + name);
        /*Random generate = new Random();

        for(int i = 0; i < 6; i++){
            int number = generate.nextInt(60);
            System.out.println(number);
        }

        int i = 0;
        while (i < 6) {
            int number = generate.nextInt(60);
            System.out.println(number);
            i++;
        }*/
    }
}
