public class calculatorSbrecarga {

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int soma(int a, int b, int c) {
        return a + b + c;
    }

    public static double soma(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(soma(2, 3));          // Chama o método com dois inteiros
        System.out.println(soma(2, 3, 4));       // Chama o método com três inteiros
        System.out.println(soma(2.5, 3.5));      // Chama o método com dois doubles
    }
}
