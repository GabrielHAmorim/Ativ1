//9.	Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.

//oC = 5 * ((F-32) / 9).


import java.util.Scanner;

public class Ativ9 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        float iCelsius, iFahrenheit;

        System.out.println("Digite; a temperatura em graus Fahrenheit :");
        iFahrenheit = input.nextFloat();
        
        input.close();

        //float C = (F -32.0) * ( 5.0 /9.0 );   

        iCelsius = 5 * ((iFahrenheit - 32) / 9);
    
        System.out.println("A temperatura em Celcius é de " + iCelsius);

    }
}
