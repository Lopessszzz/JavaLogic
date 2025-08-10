import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exs {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Olá, informe o seu nome:");
        var name = scanner.next();
        System.out.println("Olá, informe so seu ano de nascimento");
        var anoNascimento = scanner.nextInt();
        var idade = OffsetDateTime.now().getYear() - anoNascimento;
        System.out.printf("Olá %s, você tem %d anos. \n", name, idade);


        var scanner1 = new Scanner(System.in);
        System.out.println("Olá, informe o primeiro lado do quadrado:");
        var side1 = scanner1.nextDouble();
        System.out.println("Olá, informe o segundo lado do quadrado:");
        var side2 = scanner1.nextDouble();
        var area = side1 * side2;
        System.out.printf("A área do quadrado é: %.2f\n", area);


        var scanner2 = new Scanner(System.in);
        System.out.println("Olá, informe a base do retângulo:");
        var baseRetangulo = scanner2.nextDouble();
        System.out.println("Olá, informe a altura do retângulo:");
        var alturaRetangulo = scanner2.nextDouble();
        var areaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.printf("A área do retângulo é: %.2f\n", areaRetangulo);

        scanner2.close();

        var scanner3 = new Scanner(System.in);
        System.out.println("Olá, informe o primeiro nome:");
        var namee1 = scanner3.next();
        System.out.println("Olá, informe a idade de " + namee1 + ":");
        int idade1 = scanner3.nextInt();
        scanner3.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Olá, informe o segundo nome:");
        var namee2 = scanner3.next();
        System.out.println("Olá, informe a idade de " + namee2 + ":");
        int idade2 = scanner3.nextInt();

        int diferença = Math.abs(idade1 - idade2);

        System.out.println("A diferença de idade entre " + namee1 + " e " + namee2 + " é de " + diferença + " anos."
        );

        scanner.close();
        scanner1.close();
        scanner2.close();
        scanner3.close();
    }

}
