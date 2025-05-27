public class whileDeterminado {
    public static void main(String[] args) {
        
        int contador = 1;

        // while (exp <- true ou false)
        // essa expressão sempre irá nos retornar true ou false

        while (contador <= 20) {
            System.out.printf("i = %d\n", contador);
            contador += 2;
        }

    }
}
