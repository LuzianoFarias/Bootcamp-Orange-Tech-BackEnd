package src.arrays;

import java.util.Random;

public class Ex4_arrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();// Gerar números aleatórios.

        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++) {//Coluna.
            for (int j = 0; j < M[i].length; j++) {//Linha.
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M ) {// Variável ( LINHA ) foi criada aqui!
            for (int coluna : linha ) {// Variável ( COLUNA ) foi criada aqui!
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

    }
}
