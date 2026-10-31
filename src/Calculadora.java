import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem Vindo a Calculadora!");

        boolean continuar = true;
        while(continuar) {

            double numero1 = lerNumero( teclado,"Digite o Primeiro Numero: ");
            System.out.println("Voce digitou: " + numero1);

            double numero2 = lerNumero( teclado,"Digite o Segundo Numero: ");
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

            continuar = desejaContinuar(teclado);
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
    public static double lerNumero(Scanner teclado, String mensagem){
        System.out.print(mensagem);
        return teclado.nextDouble();
    }
    public static boolean desejaContinuar(Scanner teclado){
        System.out.print("Deseja fazer outra conta? (s/n):");
        char resposta = teclado.next().charAt(0);
        return resposta == 's'|| resposta == 'S';
    }

}