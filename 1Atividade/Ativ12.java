//12.	Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

import java.util.Scanner;

public class Ativ12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double iAltura, iIdeal, iCalculo;

        System.out.println("Digite sua altura: ");
        iAltura = input.nextDouble();

        iCalculo =((72.7 * iAltura) - 58);

        System.out.println("O peso ideal para sua estatura é de " + iCalculo + " Kilos");
        
    }
    
}
