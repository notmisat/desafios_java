package desafios;
public class desafioFor {
    public static void main(String[] args) {
        
        String valor = "#";
        for(int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }

        // Versão do desafio
        // Não pode usar valor numérico para controlar o laço.

        for(String v = "#"; !v.equals("######"); v += "#") {
            System.err.println(v);
        }
    }
}
