public class LacoDoWhile {
    public static void main(String[] args) {
        int contador = 1;
        do {
            System.out.println("Contador do-while: " + contador);
            contador++;
        } while (contador <= 10);
    }
}

// do-while executa o bloco de código pelo menos uma vez antes de verificar a condição
// útil quando o código dentro do laço precisa ser executado antes da verificação da condição
// a condição é verificada após a execução do bloco, diferente do while tradicional
// pode ser usado para menus que devem ser exibidos pelo menos uma vez
