public class StringExemplo {

    public static void main(String[] args) {
        String texto = "Java para concursos";
        System.out.println("Texto: " + texto);
        System.out.println("Tamanho: " + texto.length());
        System.out.println("texto da letra 0 a letra 4: " + texto.substring(0, 4));
        System.out.println("Maiúsculas: " + texto.toUpperCase());
        System.out.println("Minúsculas: " + texto.toLowerCase());
        System.out.println("Letra na posição 2: " + texto.charAt(2));
        System.out.println("Texto igual a 'Java para concursos'? " + texto.equals("Java para concursos"));
        System.out.println("Texto igual a 'Java'? " + texto.equals("Java para concursos"));
    }
}

// Saída:
// Texto: Java para concursos
// Tamanho: 20
// texto da letra 0 a letra 4: Java
// Maiúsculas: JAVA PARA CONCURSOS
// Minúsculas: java para concursos
// Letra na posição 2: v
// Texto igual a 'Java para concursos'? true
// Texto igual a 'Java'? false
