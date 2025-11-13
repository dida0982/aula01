public class Sintaxe_basica {
    
}
/*2 .5 . SinTaXe BÁSica da LingUagem
2 .5 . SinTaXe BÁSica da LingUagem
A sintaxe de uma linguagem de programação são as regras que definem como você deve escrever o código para que o compilador possa entendê-lo. A sintaxe de Java é baseada em C e C++, clara, fortemente tipada, mas com algumas simplificações.
Quando consideramos um programa Java, ele pode ser definido como uma coleção de objetos que se comunicam através da invocação dos métodos uns dos outros. Abaixo estão os principais elementos:
• Classes e objetos: toda aplicação Java é baseada em classe. O código é organizado dentro de classes e os objetos são instâncias dessas classes;
class Pessoa {
String nome;
}
• Métodos: blocos de código que definem comportamentos. São declarados dentro de classes;
• void falar() {
• System.out.println(“Olá!”);
• }
• Tipos de dados: primitivos (int, float, char, boolean etc.) e de Referência (string, arrays, objetos personalizados);
• Variáveis: armazenam valores e podem ser locais, de instância ou estáticas;
int idade = 30;
• Operadores: matemáticos (+, -, *, /), relacionais (==,!=, >, <), lógicos (&&, ||,!);
• Estruturas de controle: condicionais (if, else, switch) e laços (for, while, do-while);
• Modificadores de acesso: controlam a visibilidade de classes, métodos e atributos (public, private, protected, default);
• Palavra-chave main: método de entrada do programa Java;
public static void main(String[] args) {
// Código a ser executado
}
• Uso de new: cria novos objetos;
Pessoa p = new Pessoa();
• Sintaxe de blocos: blocos de código são delimitados por chaves {}. Cada instrução termina com ponto e vírgula;
Pontos importantes sobre os programas Java:
• Case Sensitivity – Java é case sensitivity, o que significa que o identificador Hello e olá teria um significado diferente em Java;
• Nomes de classe – Para todos os nomes de classe, a primeira letra deve estar em Upper Case. Se várias palavras são usadas para formar um nome da classe, a primeira letra de cada palavra interior deve estar em Upper Case;
EXEMPLO
class MyFirstJavaClass
• Nomes de método – Todos os nomes dos métodos devem começar com uma letra de caso inferior. Se várias palavras são usadas para formar o nome do método, então a primeira letra de cada palavra interna deve estar em Upper Case;
EXEMPLO
public void myMethodName()
• Nome do arquivo do programa – Nome do arquivo do programa deve corresponder exatamente ao nome da classe. Ao salvar o arquivo, você deve salvá-lo usando o nome da classe (Remember Java é maiúsculo) e anexar ‘.java’ ao final do nome ((se o nome do arquivo e o nome da classe não corresponderem, seu programa não compilará). Entretanto, caso você não tenha uma classe pública presente no arquivo, o nome do arquivo pode ser diferente do nome da classe. Também não é obrigatório ter uma classe pública no arquivo;
EXEMPLO
Assuma ‘MyFirstJavaProgram’ é o nome da classe. Em seguida, o arquivo deve ser salvo como ‘MyFirstJavaProgram.java’
• public static void main(String args[]) – O processamento de programas Java começa a partir do método main(), que é uma parte obrigatória de cada programa Java.
*/