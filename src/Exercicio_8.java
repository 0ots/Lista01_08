import java.util.Scanner;

public class Exercicio_8 {

    public static void main(String[] args) throws Exception {

        double ganhahora, horastrabalhadas, salario;

        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Digite quanto você ganha por hora: ");

        ganhahora = input.nextDouble();

        System.out.println("Digite quantas horas você trabalhou no mês: ");

        horastrabalhadas = input.nextDouble();

        input.close();

        salario = ganhahora * horastrabalhadas;

        System.out.print("Seu sal rio  : " + salario);

    }
    
}