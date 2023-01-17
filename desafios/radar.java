package src.desafios;

import java.util.Scanner;

public class radar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a velocidade do veiculo: ");
        int velocidadeAtual = leitor.nextInt();

       String velocidade = velocidadeAtual <= 60 ? "Nao foi multado" : "Foi multado";
       System.out.println(velocidade);
    }
}
