public class Escopo {
    static int global = 100;

    public static void main(String[] args) {
        int local = 10;
        System.out.println("Local: " + local);
        System.out.println("Global: " + global);
        testarEscopo();
    }

    public static void testarEscopo() {
        System.out.println("Global:" + global);
    }
}