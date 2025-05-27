import javax.swing.JOptionPane;

public class ifElse {
    public static void main(String[] args) {
        
        String valor = JOptionPane.showInputDialog
            ("Informe o número: ");

        int numero = Integer.parseInt(valor);

        /* if (numero % 2 == 0) {
            System.out.println("Número é par!");
        } */

        /*  if (numero % 2 == 1) {
            System.out.println("Número é ímpar!");
        } */

        if (numero % 2 == 0) {
            System.out.println("Número é par!");
        } else { 
            System.out.println("Número é ímpar!"); 
        }


        }

}
