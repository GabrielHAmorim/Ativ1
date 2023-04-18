// 16.	Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

import java.util.Scanner;

public class Ativ16 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int iLatas2;
    double iMetros, iValor, iLitros, iLatas;

    System.out.println("Digite a área que precisa ser pintada: ");
    iMetros = input.nextDouble();

    iLitros = iMetros/3;

    iLatas = (iLitros/18);

    if (iLatas % 18 != 0){
        iLatas = iLatas + 1;
    }
    
    iLatas2 = iLatas;

    System.out.println("Você vai precisar comprar " + iLatas2 + " latas");
    System.out.println("Você vai gastar R$ " + (iLatas*80));

  }
    
}
