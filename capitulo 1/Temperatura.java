public class Temperatura {
    public static void main(String[] args) {
        // Fórmula para calcular fahrenheit = (°F - 32) x 5/9 = °C
        
        /* Designando váriaveis FATOR e AJUSTE
        para a conversão em fahrenheit */
        final double FATOR = 5/9.0;
        final double AJUSTE = 32;
        
        // Valor aleatório para fahrenheit
        double fahrenheit = 86;

        // Cálculo para conversão em celsius
        double celsius = (fahrenheit - AJUSTE) * FATOR;

        // Resultado gerado no terminal
        System.out.println("O resultado é " + celsius  + "°C.");
        
        // Outro exemplo de cálculo
        fahrenheit = 150;
        celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius  + "°C.");
    }
}
