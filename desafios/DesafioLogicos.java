package desafios;
public class DesafioLogicos {
    public static void main(String[] args) {
        
        boolean trabalho1 = true;
        boolean trabalho2 = true;

        // Operador binário
        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        
        // Operador unário
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50? " + comprouTv50);
        System.out.println("Comprou TV 32? " + comprouTv50);
        System.out.println("Comprou TV 50? " + comprouTv32);
        System.out.println("Comprou Sorvete? " + comprouSorvete);

        // Operadores unários

        // Comprou sorvete = não esta saudavel (false)
        System.out.println("Mais saudável? " + !comprouSorvete);

        // Não comprou sorvete = mais saudavel (true)
        System.out.println("Mais saudável? " + !maisSaudavel);
        

    }
}
