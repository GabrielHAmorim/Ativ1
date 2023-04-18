//10.	Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

//F = c

import java.util.Scanner;

public class Ativ10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double iCelcius, iFahrenheit;

        System.out.println("Digite a temperatura em Celcius ");
        iCelcius= input.nextDouble();

        iFahrenheit = iCelcius * 1.8 + 32;

        System.out.println("A temperatura em Fahrenheit é de " + iFahrenheit + " graus");
   
    }
}