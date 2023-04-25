
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

    
        System.out.println("Digite sua nota 1: ");

        int nota1 = s.nextInt();
        
        System.out.println("sua primeira nota é " + nota1 + "nota");

        
        System.out.println("Digite sua nota 2: ");
        int nota2 = s.nextInt();
        System.out.println("sua segunda nota nota é " + nota2 + "nota");

    
        System.out.println("Digite sua nota 3: ");
        int nota3 = s.nextInt();
        System.out.println("sua terceira nota nota é " + nota3 + "nota");

        
        System.out.println("Digite sua nota 4: ");
        int nota4 = s.nextInt();
        System.out.println("sua Quarta nota nota é " + nota4 + "nota");


        int resultado = (nota1 + nota2 + nota3 + nota4) / 4;
            
            System.out.println(" O resultado é " + resultado + "resultado");

            
        if (resultado >= 7) {
            System.out.println("Você esta aprovado");
        } else if (resultado <= 5); 
            System.out.println("Você esta de Recuperação");
        if (resultado <= 4); 
            System.out.println("Você Foi Reprovado");   
        }
    

    }

