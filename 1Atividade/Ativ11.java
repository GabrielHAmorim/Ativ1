//11.	Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//a.	o produto do dobro do primeiro com metade do segundo .
//b.	a soma do triplo do primeiro com o terceiro.
//c.	o terceiro elevado ao cubo.

import java.util.Scanner;

public class Ativ11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int iNum1, iNum2;
        double iNum3;

        System.out.println("Digite o primeiro numero inteiro ");
        iNum1 = input.nextInt();

        System.out.println("Digite o segundo numero inteiro ");
        iNum2 = input.nextInt();

        System.out.println("Digite o numero real ");
        iNum3 = input.nextDouble();

        //Respostas

        System.out.println("a.	o produto do dobro do primeiro com metade do segundo: " + (( 2 * iNum1 ) * ( iNum2 / 2 )));
        //System.out.println( ( 2 * iNum1 ) + ( iNum2 / 2 ) );

        System.out.println("b.	a soma do triplo do primeiro com o terceiro: " + (( 3 * iNum1 ) + iNum3));
        //System.out.println( ( 3 * iNum1 ) + iNum3);

        System.out.println("c.	o terceiro elevado ao cubo: " + (Math.pow(iNum3, 2)));
        //System.out.println(Math.pow(iNum3, 2));

    }
}