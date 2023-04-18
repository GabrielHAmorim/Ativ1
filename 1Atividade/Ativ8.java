//8.	Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class Ativ8 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double iValorHora, iHorasTrabalhadas;

    System.out.println("Digite o valor recebido por hora de trabalho: ");
    iValorHora = input.nextDouble();

    System.out.println("Digite o quantas horas por mês você trabalhou: ");
    iHorasTrabalhadas = input.nextDouble();

    System.out.println("Voce receberá R$" + (iValorHora * iHorasTrabalhadas));

}
    
}