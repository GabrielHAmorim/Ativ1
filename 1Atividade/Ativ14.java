//14.	João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

import java.util.Scanner;

public class Ativ14 {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double iPeso, iExcesso, iMulta;
        
        System.out.println("Digite o peso dos peixes pescados: ");
        iPeso = input.nextDouble();

        if (iPeso<50){
            System.out.println("Não houve excesso de peso");
        } else {
            iExcesso = iPeso - 50;
            iMulta = iExcesso * 4;
            System.out.println("O excesso foi de " + iExcesso + ", gerando uma multa de R$" + iMulta);
        }
    }
    
}
