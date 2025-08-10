import java.util.Scanner;

public class Aritmeticos {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo número:");
        var value2 = scanner.nextInt();
        System.out.printf("%d + %d = %d\n", value1, value2, (value1 + value2));

        

        var value = 5 + 9 * 10 - 5 / 2;
        System.out.println("O resultado da expressão é: " + value);

        var valuee = (5 + 9) * (10 - 5) / 2;
        System.out.println("O resultado da expressão é: " + valuee);

        var valueee = 5;
        valueee += 3; // valueee = valueee + 3
        System.out.println("O resultado da expressão é: " + valueee);

        var scanner1 = new Scanner(System.in);
        System.out.println("Informe o primeiro número da raiz quadrada:");
        var value3 = scanner1.nextInt();
        System.out.printf("A raiz quadrada de %d é: %.2f\n", value3, Math.sqrt(value3));


        var scanner2 = new Scanner(System.in);
        System.out.println("Informe o primeiro número da potência:");
        var value4 = scanner2.nextInt();
        System.out.printf("A potência de %d é: %.2f\n", value4, Math.pow(value4, 2));


        var value5 = 50;
        System.out.println(++value5);
        System.out.println("O resultado da expressão é: " + value5);

        var value6 = 50;
        System.out.println(value6++);
        System.out.println("O resultado da expressão é: " + value6);

        scanner.close();
        scanner1.close();
        scanner2.close();

        //valores de incremento na direita aparecem na prox linha, a esquerda na mesma
    }
}
