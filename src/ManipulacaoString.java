public class ManipulacaoString {
    public static void main(String[] args) {
        String frase = "Aprenda Java";
        System.out.println("Concatenação: " + frase + " hoje!");
        System.out.println("Sem espaço:: " + frase.trim());
        System.err.println("Substituição: " + frase.replace("Java", "Programação"));
    }
}

// + é o operador de concatenação para strings
// trim() remove espaços em branco no início e no fim da string
// replace() substitui parte da string por outra string