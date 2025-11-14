import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiposDeReferencia {

    String nome = "Flávia"; // nome guarda a referência para um objeto String
    Scanner leitor = new Scanner(System.in); // leitor guarda referência para Scanner
    int[] numeros = { 1, 2, 3 }; // array de inteiros
    Pessoa minhaPessoa = new Pessoa(); // referência para objeto Pessoa
    List<String> listaNomes = new ArrayList<>(); // referência para objeto ArrayList

}

// Tipos de referência armazenam referências (endereços) para objetos na memória
// Diferente dos tipos primitivos que armazenam valores diretamente
// Exemplos de tipos de referência: String, Arrays, Objetos personalizados, Coleções (List, Map, Set)
// Permitem manipular dados complexos e estruturas dinâmicas
// Operações comuns incluem criação, acesso a métodos e atributos, passagem como parâmetros e retorno de métodos
