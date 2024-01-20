// Classe que representa um círculo
class Circulo extends Figura {
    private double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do círculo
    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}