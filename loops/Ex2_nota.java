package src.loops;

import java.util.Scanner;

public class Ex2_nota {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int nota;

        System.out.println("Informe sua nota" );
        nota = ler.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Nota inválida! Digite novamente: ");
            nota = ler.nextInt();
        }
    }

}
