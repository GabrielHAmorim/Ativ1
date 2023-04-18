//3.	Faça um Programa que peça dois números e imprima a soma.

import java.util.Scanner;

public class Ativ3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    float iNumero1, iNumero2;

    System.out.println("Digite o primeiro número: ");
    iNumero1 = input.nextFloat();

    System.out.println("Digite o segundo número: ");
    iNumero2 = input.nextFloat();
    input.close();
    
    System.out.println(iNumero1 + iNumero2);

    }
}
