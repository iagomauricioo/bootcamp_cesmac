// Classe que representa um retângulo
class Retangulo extends Figura {
    private double largura;
    private double altura;

    // Construtor
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Método para calcular a área do retângulo
    @Override
    double calcularArea() {
        return largura * altura;
    }
}