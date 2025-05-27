public class TipoString {
    
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde"; // String sempre será um objeto imutável
        s = s.toUpperCase(); // Deixa as letras em CAPS LOCK
        s = "Bom dia"; // Você consegue subistituir porém não o valor original
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa")); // Retornou falso pois a string não pode modificar o valor original dela na linha 8
        System.out.println(s.toLowerCase().startsWith("boa")); // Retornou falso pois não começa com letra minuscula linha 8
        System.out.println(s.length()); // Retornou valor 7 pois a string é imutável, sendo assim os valor adicionados após não são adicionados ao valor final
        System.out.println(s.endsWith("tarde")); // Retornou falso pois a string não pode modificar o valor original dela na linha 8
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        // Outro exemplo

        String x = "Boa tarde"; // String sempre será um objeto imutável
        System.out.println(x.concat("!!!"));
        System.out.println(x + "!!!");
        System.out.println(x.startsWith("Boa")); 
        System.out.println(x.toLowerCase().startsWith("boa")); 
        System.out.println(x.toUpperCase().endsWith("TARDE")); 
        System.out.println(x.length());
        System.out.println(x.toLowerCase().equals("boa tarde"));
        System.out.println(x.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("Nome: " + nome + "\nSobrenome: "
         + sobrenome + "\nIdade: "+ idade + "\nSalario "
          + salario + "\n\n" );

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f."
            , nome, sobrenome, idade, salario);

    
        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f."
            , nome, sobrenome, idade, salario);

            System.out.println(frase);
        
    }
}
