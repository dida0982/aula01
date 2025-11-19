public abstract class Forma {
    public abstract double calcularArea();
}

class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class TesteAbstrato {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
}