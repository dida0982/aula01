public class LacoWhile {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 10) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}

// while verifica a condição antes de executar o bloco de código
// útil quando o número de iterações não é conhecido antecipadamente
// o bloco de código dentro do while pode não ser executado nenhuma vez se a condição for falsa desde o início
// pode ser usado para ler dados até que uma condição de parada seja atendida