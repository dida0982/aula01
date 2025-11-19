interface Veiculo {
    void mover();
}
class Carro implements Veiculo {
    @Override
    public void mover() {
        System.out.println("O carro está se movendo");
    }
}
class TesteInterface {
    public static void main(String[] args) {
        Veiculo meuVeiculo = new Carro();
        meuVeiculo.mover();
    }
}