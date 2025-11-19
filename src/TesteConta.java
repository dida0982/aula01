public class TesteConta {
    
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setSaldo(1000);
        conta.depositar(500);
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
