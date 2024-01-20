import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
        //Atividade de fixação de tudo o que vimos

        //Abstração, Encapsulamento, Herança, Polimorfismo e Tratamento de exceções

        //Atividade simples utilizando formas geométricas
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Escolha uma figura: ");
            System.out.println("1. Círculo");
            System.out.println("2. Retângulo");
            int escolha = scanner.nextInt();

            Figura figura;

            switch (escolha) {
                case 1:
                    System.out.println("Informe o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    figura = new Circulo(raio);
                    break;
                case 2:
                    System.out.println("Informe a largura do retângulo: ");
                    double largura = scanner.nextDouble();
                    System.out.println("Informe a altura do retângulo: ");
                    double altura = scanner.nextDouble();
                    figura = new Retangulo(largura, altura);
                    break;
                default:
                    System.out.println("Opção inválida");
                    return;
            }

            // Exibir a área da figura escolhida
            System.out.println("Área da figura: " + figura.calcularArea());

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número.");
        } finally {
            scanner.close();
        }
    }
}