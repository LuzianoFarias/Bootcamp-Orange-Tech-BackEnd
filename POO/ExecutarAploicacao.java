package src.POO;

class ExecutarAploicacao {

    public static void main(String[] args){

        Carro carro1 = new Carro();// Objeto vazio

        carro1.setCor("Azul");// Cargas para objeto
        carro1.setmodelo("BMW 320i");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.valorTotalTanque(6.39));

        Carro carro2 = new Carro("Cinza", "Mercedes-Bens Classe A", 66);//Objeto com parametros.

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.valorTotalTanque(6.46));
    }
}
