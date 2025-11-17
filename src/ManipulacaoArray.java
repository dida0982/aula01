public class ManipulacaoArray{

    public static void main(String[] args) {
        int[] valores = { 1, 2, 3, 4, 5 };
        System.out.println("Tamanho do array:" + valores.length);
        valores[2] = 10;
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + valores[i]);
        }
    }
}
