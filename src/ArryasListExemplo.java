import java.util.ArrayList;

public class ArryasListExemplo {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");
        System.out.println("Tamanho : " + nomes.size());
        System.out.println("Primeiro nome : " + nomes.get(0));
        nomes.remove(1);
        System.out.println("Após remoção: " + nomes);
    }
}