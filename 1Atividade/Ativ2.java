//2.	Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

import java.util.Scanner;

public class Ativ2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float iNumero;
    
        System.out.println("Digite um número:");
        iNumero = input.nextFloat();
        input.close();

        System.out.println("O número digitado foi " + iNumero);
    }
}
