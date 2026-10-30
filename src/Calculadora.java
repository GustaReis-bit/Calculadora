import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem Vindo a Calculadora!");

        boolean continuar = true;
        while(continuar) {

            System.out.print("Digite o Primeiro Numero: ");
            double numero1 = teclado.nextDouble();

            System.out.println("Voce digitou: " + numero1);

            System.out.print("Digite o Segundo Numero: ");
            double numero2 = teclado.nextDouble();

            System.out.println("Voce digitou: " + numero2);

            System.out.print("Digite a Operaçao(+, -, *, /): ");
            char operaçao = teclado.next().charAt(0);

            System.out.println("Operaçao escolhida: " + operaçao);

            double resultado = 0;
            switch (operaçao) {
                case '+':
                    resultado = somar(numero1, numero2);
                    break;
                case '-':
                    resultado = subtrair(numero1, numero2);
                    break;
                case '*':
                    resultado = multiplicar(numero1 , numero2);
                    break;
                case '/':
                    if (numero2 == 0) {
                        System.out.println("Erro: não é possivel dividir por zero!");
                        continue;
                    }
                    resultado = dividir(numero1, numero2);
                    break;
                default:
                    System.out.println("Operaçao Invalida");
                    continue;
            }
            System.out.println("Resultado: " + resultado);

            System.out.print("Deseja fazer outra conta? (s/n): ");
            char resposta = teclado.next().charAt(0);

            if (resposta == 'n'){
                continuar = false;
            }
        }

        System.out.println(" Calculadora encerrada. Até logo!");
    }

    public static double somar(double a, double b){
        return a + b;
    }
    public static double subtrair(double a, double b){
        return a- b;
    }
    public static double multiplicar(double a, double b){
        return a * b;
    }
    public static double dividir(double a, double b){
        return a/b;
    }

}