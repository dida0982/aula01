public class Carro {
    String modelo;
    int velocidade;

    void acelerar(int incremento){
        velocidade += incremento;
    }
}
class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.velocidade = 50;
        carro.acelerar(20);
        System.out.println("Modelo: " + carro.modelo + ", Velocidade: " + carro.velocidade + " km/h");
    }
}
