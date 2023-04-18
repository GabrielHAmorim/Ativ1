//13.	Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
 //.	Para homens: (72.7*h) - 58
 //a.	Para mulheres: (62.1*h) - 44.7

import java.util.Scanner;

public class Ativ13 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        double iAltura, iCalculo;
        String iSexo;

        System.out.println("Você é Homem ou Mulher?");
        iSexo = input.nextLine();

        System.out.println("Digite sua altura ");
        iAltura = input.nextDouble();

        System.out.println(iSexo);

        if (iSexo.equals("Homem")) {
            iCalculo = ((72.7 * iAltura) - 58);
          } else if (iSexo.equals("Mulher")) {
            iCalculo = ((62.1 * iAltura) - 44.7);
          } else {
            iCalculo = (0);
          }
    
        System.out.println("O peso ideal para sua altura é de " + iCalculo + " Kilos");
    
    }
}
