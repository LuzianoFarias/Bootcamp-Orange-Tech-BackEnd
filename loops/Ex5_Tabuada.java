package src.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual tabuada deseja fazer: ");
        int tabuada = ler.nextInt();

        System.out.println("Tabuada de " + tabuada + ":");

        for (int i = 1; i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
