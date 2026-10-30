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
                    resultado = numero1 + numero2;
                    break;
                case '-':
                    resultado = numero1 - numero2;
                    break;
                case '*':
                    resultado = numero1 * numero2;
                    break;
                case '/':
                    if (numero2 == 0) {
                        System.out.println("Erro: não é possivel dividir por zero!");
                        continue;
                    }
                    resultado = numero1 / numero2;
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
}