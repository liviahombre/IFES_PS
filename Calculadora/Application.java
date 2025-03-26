import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo numero:");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Digite o número da operação:");
        int operacao = scanner.nextInt();
        
        double resultado = 0;
        
        switch (operacao) {
            case 1:
            resultado = num1 + num2;
            break;
            case 2:
            resultado = num1 - num2;
            break;
            case 3:
            resultado = num1 * num2;
            break;
            case 4:
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: Divisao por zero");
                return;
            }
            break;
            default:
            System.out.println("Operacao invalida");
            return;
        }
        
        System.out.println("O resultado eh: " + resultado);
    }
}
