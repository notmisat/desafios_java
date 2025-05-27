import java.util.Scanner;

public class ifElseIf {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = entrada.nextDouble();


        /* Não é possível iniciar um codigo usando ELSE, 
        pois ele obrigatóriamente precisa estar associado a um IF */
        
        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida!");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A");
        } else if (nota >= 6.1) {
            System.out.println("Conceito B");
        } else if (nota >= 4.1) {
            System.out.println("Conceito C");
        } else if (nota >= 2.1) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }
        /* No Conceito E, não é necessário utilizar o else if pois as notas
         a baixo de 2.1 serão associadas automaticamente a ele */
        
        System.out.println("Fim!");
        entrada.close();
    }
}
