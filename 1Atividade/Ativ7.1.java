//7.	Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner

public class Ativ7 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double iAltura,iArea,iDobro;

    System.out.println("Digite a altura do quadrado ");
    iAltura = input.nextDouble();

    iArea = iAltura * iAltura;

    iDobro = iArea * 2;

    System.out.println("A área do quadrado é de " + iArea + "e o dobro dessa área é: " + iDobro);
        
    }
    
}