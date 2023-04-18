//6.	Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

import java.util.Scanner;

public class Ativ6 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double iRaio, iPi, iElevado, iArea;

    iPi = 3.14159265358979323846;

    System.out.println("Digite o raio de um círculo: ");
    iRaio = input.nextDouble();
    
    // (A = π r²)

    iElevado = Math.pow(iRaio, 2);

    iArea =  iPi * iElevado;

    System.out.println("A áre desse cículo é de " + iArea);

    }
}
