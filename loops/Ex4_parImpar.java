package src.loops;

import java.util.Scanner;

public class Ex4_parImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = ler.nextInt();

        int count = 0;
        do{
            System.out.println("Número: ");
            numero = ler.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantitade Impar: " + quantImpares);
    }
}
