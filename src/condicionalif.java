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

// if inicia uma estrutura condicional
// else if adiciona uma condição adicional à estrutura condicional
// else captura todos os casos não cobertos pelas condições anteriores
// as condições dentro do if e else if são avaliadas em ordem, e o primeiro bloco verdadeiro é executado
// pode ser usado para tomar decisões baseadas em diferentes condições, como validação de idade, status de usuário, etc.