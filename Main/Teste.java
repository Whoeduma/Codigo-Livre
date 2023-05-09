
package Main;

import Classes.Carro;


public class Teste {

   
    public static void main(String[] args) {
         Carro carro = new Carro("Ford", "Fiesta", 2006, 160000, "Hatch", "Gasolina");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Preco: " + carro.getPreco());
        System.out.println("Tipo: " + carro.getTipo());
        System.out.println("Combustivel: " + carro.getCombustivel());
    }
    
}
