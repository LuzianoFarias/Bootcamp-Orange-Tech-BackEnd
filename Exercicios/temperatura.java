package src.Exercicios;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Double> temperaturaSemestral = new ArrayList<Double>();

        Double soma = 0.0;
        for (int i = 1; i <= 6; i++){
            System.out.println("Informe a temperatura " + i + ":");
            Double temp = scan.nextDouble();
            temperaturaSemestral.add(temp);
            soma += temp;
        }

        Double mediaTemperaturaSemestral = soma / temperaturaSemestral.size();

        System.out.println("Temperatura semestral: " + temperaturaSemestral);
        System.out.println("Média temperaturas semestral: " + mediaTemperaturaSemestral + " oC");


    }
}
