# Java Polimorfismo: Entenda Herança E Interfaces

Esse é o meu terceiro curso em Java, estou estudando a formação Java E Orientação À Objetos.

* Link da formação: https://www.alura.com.br/formacao-java
* Link do curso: https://www.alura.com.br/curso-online-java-heranca-interfaces-polimorfismo

Leituras recomendadas:
* Robert C Martin - Clean Code

Links importantes
* Sobre polimorfismo
*		https://www.devmedia.com.br/uso-de-polimorfismo-em-java/26140
*		http://www.universidadejava.com.br/java/java-polimorfismo/
*		https://www.w3schools.com/java/java_polymorphism.asp

Implementação daquilo que estou aprendendo:
* Aplicarei aquilo que aprendi no Package `biblioteca` 
* A descrição do projeto pode ser vista à baixo

# Projeto Biblioteca
Em nossa biblioteca precisamos do cadastro para leitores e escritores, eles compartilharam alguns atributos em comum.
```
A ideia dessa parte é criar algo para trabalhar com os conceitos de super class e sobrescrita
```
Como o número de usuários está crescendo, pensei em criar algo que avalie o empenho 
dos usuários dentro da plataforma. Por possuir um cadastro o usuário ganha 10% de bonus 
sobre a sua pontuação. Se ele for um leitor, ganha 30% além dos 10%, ou seja 40% sobre 
a pontuação do cadastro de usuário. 
Se for escritor 50%, mais 50% sobre o bonus do cadastro de usuário. 

```
Agora tentarei criar um exemplo para polimorfismo
```

Toda classe deve conter um método que apresente o objeto que ela contém, retornando 
o um String com o seguinte exemplo:
```java
sobrenome + ", " + nome + ". Pontuação: " + pontuacaoComBonus
```
Para evitar copiar e colar, criar uma classe separada que implemente isso. 

## Documentação das Classes

### Pessoa
Atributos:
* `nome` - Primeiro nome da pessoa
* `sobrenome` - Demais nomes
* `pontuacao` - pontuação ganha dentro da biblioteca. 

Funções:
* `getPontuacaoComBonus` - retorna a pontuação com o bonus da classe
* `getApresentacao` - retorna a mensagem de apresentação da classe

Validações:
* O atributo `nome` **não pode** permitir a insersão de duas palavras

### Leitor
Atributos:
* `senha` - Senha do leitor
* `status` - Status atual do leitor

Funções:
* `getPontuacaoComBonus` - retorna a pontuação com o bonus da classe
* `getApresentacao` - retorna a mensagem de apresentação da classe

### Escritor
Atributos:
* `possuiReview` - Identifica se já foi escrito um review sobre o escritor
* `numeroDeLivros` - Identifica a quantidade de livros do escritor na biblioteca

Funções:
* `getPontuacaoComBonus` - retorna a pontuação com o bonus da classe
* `getApresentacao` - retorna a mensagem de apresentação da classe

### Apresentação
Funções:
* `getApresentacao` - retorna a mensagem de apresentação da pessoa que foi passada como parâmetro