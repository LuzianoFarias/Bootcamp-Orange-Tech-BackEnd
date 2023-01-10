package src.loops;

import java.util.Scanner;

public class Ex3_maiorMedia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do{
            System.out.println("Número: ");
            numero = ler.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count +=1;
        }while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));
    }
}
