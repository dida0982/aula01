public class ArrayMultidimensional {
    
    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        matriz [0][0] = 1;
        matriz [0][1] = 2;
        matriz [0][2] = 3;
        matriz [1][0] = 4;
        matriz [1][1] = 5;
        matriz [1][2] = 6;
        int[][] outraMatriz = { {10, 20, 30}, {40, 50, 60} };
        System.out.println("Elemento [0][1] : " + matriz[0][1]);
        System.out.println("Tamanho (linhas): " + matriz.length);
        System.out.println("Tamanho (colunas da linha 0): " + matriz[0]);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Explicação:
// Este código define uma classe chamada ArrayMultidimensional que demonstra o uso de arrays multidimensionais em Java.
// No método main, uma matriz 2x3 é criada e inicializada com valores específicos.
// Outra matriz é criada usando uma sintaxe de inicialização direta.
// O código então imprime um elemento específico da matriz, o tamanho da matriz (número de linhas) e o tamanho das colunas da primeira linha. 
// Finalmente, ele usa loops aninhados para percorrer e imprimir todos os elementos da matriz.
