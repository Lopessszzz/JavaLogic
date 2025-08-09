import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // meu comentário
        var scanner = new Scanner(System.in);
        System.out.println("Olá, informe o seu nome:");
        var name = scanner.next();
        System.out.println("Olá, informe sua idade");
        var age = scanner.nextInt();
        System.out.printf("Olá %s, você tem %d anos. \n", name, age);
        byte number = 1;
        long bigNumber = 1L;
        float decimalNumber = 1.0f;
        double bigDecimalNumber = 1.0;
        char character = 'A';
        boolean isTrue = true;
        var scan = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2:");
        var result = scan.nextInt();
        var expectedResult = result == 4;
        System.out.printf("O resultado é 4: Sua resposta é %b\n", expectedResult );
        System.out.println("Você é emancipado? (true/false)");
        var isEmancipated = scan.nextBoolean();
        var canDrive = age > 17 || (isEmancipated && age >= 16);
        System.out.printf("Você está apto a dirigir? %b\n", canDrive);


        System.out.printf("true && true = %b\n", true && true);
        System.out.printf("false && false = %b\n", false && false);
        System.out.printf("true && false = %b\n", true && false);
        System.out.printf("false && true = %b\n", false && true);
        System.out.println("Operadores lógicos:");
        System.out.printf("true || true = %b\n", true || true);
        System.out.printf("false || false = %b\n", false || false);
        System.out.printf("true || false = %b\n", true || false);
        System.out.printf("false || true = %b\n", false || true);
        System.out.println("Operadores lógicos:"); 
        System.out.printf("!true = %b\n", !true);
        System.out.printf("!false = %b\n", !false);
    }
}

// Só eh possível var porque o next retorna string