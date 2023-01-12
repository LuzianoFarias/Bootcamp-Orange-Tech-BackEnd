package src.Metodos.retorno;

public class main {
    public static void main(String[] args) {
        //Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = quadrilatero.area(3); // Variável (AREAQUADRADO) foi criada aqui!
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = quadrilatero.area(5d,5d); // Variável (AREARETANGULO) foi criada aqui!
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = quadrilatero.area(7,8,9); // Variável (AREATRAPEZIO) foi criada aqui!
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}
