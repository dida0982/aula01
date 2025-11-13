public class CondicionalSwitch2 {
    public static void main(String[] args) {
        int dia = 3;
        String diaNome;

        switch (dia) {
            case 1:
                diaNome = "Domingo";
                break;
            case 2:
                diaNome = "Segunda-feira";
                break;
            case 3:
                diaNome = "Terça-feira";
                break;
            case 4:
                diaNome = "Quarta-feira";
                break;
            case 5:
                diaNome = "Quinta-feira";
                break;
            case 6:
                diaNome = "Sexta-feira";
                break;
            case 7:
                diaNome = "Sábado";
                break;
            default:
                diaNome = "Dia inválido";
                break;
        }

        System.out.println("O dia da semana é: " + diaNome);
    }
}
// switch avalia a variável e executa o case correspondente
// break é usado para sair do switch após executar o case correspondente
// default é executado se nenhum case corresponder
// sem o break, o switch continua executando os próximos cases (fall-through)
// útil para agrupar múltiplos cases que compartilham o mesmo bloco de código