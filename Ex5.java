import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;
        int i, contAluno = 0;


        for(i=0; i < 4; i++) {
            System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
            nota1 = ler.nextInt();
            
            // recebe a 2º nota
            System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
            nota2 = ler.nextInt();
            
            // recebe a 3º nota
            System.out.println("Aluno " + contAluno + ", digite sua 3ª nota");
            nota3 = ler.nextInt();

            System.out.println("Aluno " + contAluno + ", digite sua 4ª nota");
            nota4 = ler.nextInt();
          
            media = ((nota1 + nota2 + nota3 + nota4) /4);
            System.out.println("A média do aluno " + contAluno + " é " + media);
        }



    }
}