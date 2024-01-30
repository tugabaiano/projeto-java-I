// Definindo a classe "Pessoa"
class Carro {
    // Atributos da classe
    private String marca; // Atributo privado para encapsulamento
    private int anoDeFabricacao;   // Atributo privado para encapsulamento
    private String modelo;
    private int velocidadeAtual;
    private String cor;
    
    // Método construtor da classe para inicializar os atributos
    Carro(String marca, int anoDeFabricacao, String modelo, int velocidadeAtual, String cor) {
        this.marca = marca;
        this.anoDeFabricacao = anoDeFabricacao;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
        this.cor = cor;
    }
    
    // Método getter para obter ...
    public String getMarca() {
        return marca;
    }
    
    // Método getter para obter ...
     public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }
    
    // Método getter para obter ...
     public String getModelo() {
        return modelo;
    }
    
    // Método getter para obter ...
     public int getVelocidadeAtual() {
        return velocidadeAtual;
    } 
    
    // Método getter para obter ...
    public String getCor() {
        return cor;
    }
    
 
}

// Classe principal que contém o método main
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa chamado "pessoa1"
        Carro carro1 = new Carro("BMW", 2023,"660x", 290,"Preto");
        
        // Usando os métodos getters para obter e imprimir as informações da pessoa
        System.out.println("Marca: " + carro1.getMarca()); // Obtém e imprime o nome da pessoa
        System.out.println("Ano de fabricacao: " + carro11.getAnoDeFabricacao()); // Obtém e imprime a idade da pessoa
        System.out.println("Modelo: " + carro11.getModelo());
        System.out.println("Velocidade MAX: " + carro11.getVelocidadeAtual());
        System.out.println("Cor: " + carro11.getCor());
    }
}