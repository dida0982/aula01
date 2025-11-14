public class PrincipaisComandos {

}
/*2 .5 . SinTaXe BÁSica da LingUagem2 .5 . SinTaXe BÁSica da LingUagem
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
} */

// Fim dos comandos essenciais do dia a dia no terminal
/*
--- IGNORE ---
}
File: src/Declaracao.java
--- a/file:///workspaces/aula01/src/Declaracao.java
+++ b/file:///workspaces/aula01/src/Declaracao.java
@@ -6,4 +6,5 @@
         System.out.println("Número: " + numero + ", Preço: " + preco);
     }
 }
+// declaração é o ato de criar uma variável com um tipo específico
+// inicialização é o ato de atribuir um valor inicial à variável
- --- IGNORE ---
File: src/EntradaSaida.java
--- a/file:///workspaces/aula01/src/EntradaSaida.java
+++ b/file:///workspaces/aula01/src/EntradaSaida.java
@@ -15,4 +15,9 @@
         scanner.close();
     }
 }
+// Scanner é usado para ler entrada do usuário
+// System.out.print e System.out.printf são usados para exibir saída formatada no console
+// %s é um placeholder para strings, %d para inteiros, %n para nova linha
+// scanner.nextLine() lê uma linha inteira de texto
+// scanner.nextInt() lê um número inteiro da entrada do usuário
- --- IGNORE ---
File: src/CondicionalSwitch.java
--- a/file:///workspaces/aula01/src/CondicionalSwitch.java
+++ b/file:///workspaces/aula01/src/CondicionalSwitch.java
@@ -33,3 +33,9 @@
         System.out.println("O dia da semana é: " + diaNome);
     }
 }
+// switch avalia a variável e executa o case correspondente
+// break é usado para sair do switch após executar o case correspondente
+// default é executado se nenhum case corresponder
+// sem o break, o switch continua executando os próximos cases (fall-through)
+// útil para agrupar múltiplos cases que compartilham o mesmo bloco de código
+ --- IGNORE ---
File: src/CondicionalSwitch2.java
--- a/file:///workspaces/aula01/src/CondicionalSwitch2.java
+++ b/file:///workspaces/aula01/src/CondicionalSwitch2.java
@@ -33,4 +33,8 @@
         System.out.println("O dia da semana é: " + diaNome);
     }
 }
+// switch avalia a variável e executa o case correspondente
+// break é usado para sair do switch após executar o case correspondente
+// default é executado se nenhum case corresponder
+// sem o break, o switch continua executando os próximos cases (fall-through)
+// útil para agrupar múltiplos cases que compartilham o mesmo bloco de código
- --- IGNORE ---