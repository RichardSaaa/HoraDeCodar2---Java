import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
    
        System.out.println("Informe um numero: ");

        int num = ler.nextInt();

        if (num > 0) {
            System.out.println("Positivo negrao!");
        } else if (num < 0) {
            System.out.println("Negativo negrao!");
        } else {
            System.out.println("Po negraum zero nao ne");
        }

    }
}