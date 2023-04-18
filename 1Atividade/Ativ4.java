//4.	Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;

public class Ativ4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    float iNum1, iNum2, iNum3, iNum4, iMedia;
    
    System.out.println("Digite sua primera nota do Bimestre: ");
    iNum1 = input.nextFloat();
    
    System.out.println("Digite sua segunda nota do Bimestre: ");
    iNum2 = input.nextFloat();

    System.out.println("Digite sua terceira nota do Bimestre: ");
    iNum3 = input.nextFloat();

    System.out.println("Digite sua quarta nota do Bimestre: ");
    iNum4 = input.nextFloat();

    input.close();
    
    iMedia = iNum1 + iNum2 + iNum3 + iNum4;
    
    System.out.println(iMedia/4);

    }
}