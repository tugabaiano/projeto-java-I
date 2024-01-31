class Carro {

    private String marca; 
    private int anoDeFabricacao;   
    private String modelo;
    private int velocidadeAtual;
    private String cor;
    
    Carro(String marca, int anoDeFabricacao, String modelo, int velocidadeAtual, String cor) {
        this.marca = marca;
        this.anoDeFabricacao = anoDeFabricacao;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
        this.cor = cor;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    } 
    
    public String getCor() {
        return cor;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro chamado "carro1"
        Carro carro1 = new Carro("BMW", 2023, "660x", 290, "Preto");
        
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Ano de fabricacao: " + carro1.getAnoDeFabricacao());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Velocidade MAX: " + carro1.getVelocidadeAtual());
        System.out.println("Cor: " + carro1.getCor());
    }
}
