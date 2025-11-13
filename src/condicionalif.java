public class condicionalif{

    public static void main(String[] args) {
        int idade = 28;
        if (idade >= 18) {
            System.out.println("Maior de idade.");
        } else if (idade > 13) {
            System.out.println("Adolescente.");
        } else {
            System.out.println("Criança.");
        }
    }
}