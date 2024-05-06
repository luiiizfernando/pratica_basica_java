import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args) {
        // 1 - Crie um programa que realize a médida de duas notas decimais e exiba o resultado
        double n1 = 7.85, n2 = 5.52;
        System.out.println("A média das notas: " + (n1 + n2) / 2);

        // 2 - Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resutlado
        double decimal = 7.75;
        int inteiro = (int) decimal;
        System.out.println("O resultado do casting de double para inteiro é: " + inteiro);

        // 3 - Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra = 'B';
        String resto_frase = "ola";
        System.out.println(letra + resto_frase);

        // 4 - Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 6.79;
        int quantidade = 4;
        System.out.println("O valor total é: " + (precoProduto * quantidade));

        // 5 - Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        double valorEmDolares = 50;
        double resultado = valorEmDolares * 4.94;
        System.out.println(String.format("O valor em dólares convertidos em Reais = %.2f", resultado));

        // 6 - Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        double precoOriginal = 250;
        double percentualDesconto = 10;
        double valorComDesconto = 250 * (1 - (percentualDesconto/100));
        System.out.println("O valor do produto com desconto é: " + valorComDesconto);
    }
}