package src.arrays;

import java.util.Scanner;

public class Ex2_consoantes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = ler.next(); // A variável letra foi criada aqui!

            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        } while (count < consoantes.length);

        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {// A variável CONSOANTE foi criada aqui!
            if (consoante != null)
            System.out.print(consoante + " ");
        }
    }
}
