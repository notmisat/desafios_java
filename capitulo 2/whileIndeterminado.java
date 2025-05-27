import java.util.Scanner;

public class whileIndeterminado {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        // ENQUANTO (while) não for digitado a palavra "sair" (!valor.equalsIgnoreCase("sair")), continue executando while
        while (!valor.equalsIgnoreCase("sair")) {
            System.out.printf("Você diz: ");
            valor = entrada.nextLine();
        }

        entrada.close();
    }
}
