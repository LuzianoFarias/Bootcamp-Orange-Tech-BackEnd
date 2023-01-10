package src.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual fatorial deseja fazer: ");
        int fat = ler.nextInt();

        int multiplicacao = 1;

        System.out.print(fat + "! = ");
        for (int i = fat; i >= 1; i--){
            multiplicacao *= i;
        }
        System.out.println(multiplicacao);
    }
}
