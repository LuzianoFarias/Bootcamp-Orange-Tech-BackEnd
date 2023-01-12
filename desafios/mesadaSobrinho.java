package src.desafios;

/*
Seu sobrinho começou a ganhar mesada dos pais. No auge dos seus 8 anos recebendo
 50 reais por mês, ele quer saber quanto terá se juntar
 o dinheiro, sem gastar nada, durante alguns meses. E você,
 como um bom tio com habilidades de
 programação, vai criar um programa que com as entradas do seu sobrinho vai calcular
 automaticamente a quantidade de dinheiro que ele terá em X meses
 */

import java.util.Scanner;

public class mesadaSobrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int mesada = 50;

        System.out.println("Informe quantos meses deseja juntar seu dinheiro: ");
        int entrada = leitor.nextInt();

        System.out.println("Em " + entrada + " meses você tera "+ mesada * entrada + " reais");
    }
}
