package src.desafios;

import java.util.Scanner;

public class doceria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual valor irá colocar: ");
        int doce = leitor.nextInt();

        System.out.println("O cliente obteve " + doce * 2 + " doces");
    }
}
