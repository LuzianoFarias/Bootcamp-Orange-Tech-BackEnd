package src.arrays;

import java.util.Random;

public class Ex3_numerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();//Gerar números aleatórios.

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);// Variável (número) foi criada aqui!
            numerosAleatorios[i] = numero;
        }

        System.out.print("Antecessor dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {// Uso do FOREACH.
            System.out.print((numero-1) + " ");
        }

        System.out.print("\n\n>>>>>> Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\n\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
    }
}
