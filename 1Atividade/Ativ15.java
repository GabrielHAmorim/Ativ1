//15.	Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
// .	salário bruto.
//a.	quanto pagou ao INSS.
//b.	quanto pagou ao sindicato.
//c.	o salário líquido.
//d.	calcule os descontos e o salário líquido, conforme a tabela abaixo:
//e.	+ Salário Bruto : R$
//f.	- IR (11%) : R$
//g.	- INSS (8%) : R$
//h.	- Sindicato ( 5%) : R$

//= Salário Liquido : R$
//Obs.: Salário Bruto - Descontos = Salário Líquido.

import java.util.Scanner;

public class Ativ15 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double iGanhoHora, iHorasTrabalhadas, iSalarioMes, iSalarioLiquido, iInss, iSindicato, iIR;
    
    System.out.println("Digite quando você ganha por hora ");
    iGanhoHora = input.nextDouble();

    System.out.println("Digite quantas horas você trabalhou no mês ");
    iHorasTrabalhadas = input.nextDouble();

    iSalarioMes = iGanhoHora * iHorasTrabalhadas;

    iInss = (iSalarioMes * (0.08));
    iSindicato = (iSalarioMes * (0.05));
    iIR = (iSalarioMes * (0.11));

    iSalarioLiquido = (iSalarioMes - iInss - iSindicato - iIR);

    System.out.println("Respostas");

    System.out.println("+ Salário Bruto : R$ " + iSalarioMes);
    System.out.println("- IR (11%) : R$ " + iIR);
    System.out.println("- INSS (8%) : R$ " + iInss);
    System.out.println("- Sindicato ( 5%) : R$ " + iSindicato);
    System.out.println("Salário líquido.: " + iSalarioLiquido);

    }
    
}
