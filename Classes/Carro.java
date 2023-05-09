
package Classes;


public class Carro extends Veiculo {
    private String tipo;
    private String combustivel;

    public Carro(String marca, String modelo, int ano, double preco, String tipo, String combustivel) {
        super(marca, modelo, ano, preco);
        this.tipo = tipo;
        this.combustivel = combustivel;
    }

    
    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public String getCombustivel() {
        return combustivel;
    }

    
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
