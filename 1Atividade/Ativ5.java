//5.	Faça um Programa que converta metros para centímetros.

import java.util.Scanner;

public class Ativ5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double iMetros;

        System.out.println("Digite a medida em Metros: ");
        iMetros = input.nextDouble();

        input.close();

        System.out.println(iMetros + " Metro(s) é igual a " + (iMetros*100) + " Centímetro(s)");

    }
}