public class Unarios {
    public static void main(String[] args) {
        
        int a = 1;
        int b = 2;

        a++; // a = a + 1
        a--; // a = a - 1

        ++b; // b = b + 1
        --b; // b = b -1

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini desafio...");
        // Ele só ira decrementar o valor de b após incrementar o valor de a e realizar o calculo
        // Logo, a = 2 e b = 2, retornou true. Após isso b irá valer 1, devido o pós-decremento em b
        System.out.println(++a == b--);

        // Neste exemplo ele irá retornar false
        // Pois o valor de a é 1 e o valor de b é 2
        System.out.println(a == b);
        
        System.out.println(a);
        System.out.println(b);
    }
}
