public class ControleFluxo {
    public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
            if (i==3) {
                continue;
            }
            if (i==5) {
                break;
            }
            System.out.println("i: " + i);
        }
    }
}
// continue pula a iteração atual do laço
// break sai do laço completamente
