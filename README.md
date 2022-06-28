# Java Polimorfismo: Entenda Herança E Interfaces

Esse é o meu terceiro curso em Java, estou estudando a formação Java E Orientação A Objetos.

* Link da formação: https://www.alura.com.br/formacao-java
* Link do curso: https://www.alura.com.br/curso-online-java-heranca-interfaces-polimorfismo

Leituras recomendadas:
* Robert C Martin - Clean Code

Implementação daquilo que estou aprendendo:
* Aplicarei aquilo que aprendi no Package `Biblioteca` 
* A descrição do projeto pode ser vista à baixo

# Projeto Biblioteca
Em nossa biblioteca precisamos do cadastro para leitores e escritores, eles compartilharam alguns atributos em comum.

## Documentação das Classes

#### Pessoa
Atributos:
* `nome` - Primeiro nome da pessoa
* `sobrenome` - Demais nomes

Validações:
* O atributo `nome` **não pode** permitir a insersão de duas palavras

### Leitor
Atributos:
* `senha` - Senha do leitor
* `status` - Status atual do leitor

### Escritor
Atributos:
* `possuiReview` - Identifica se já foi escrito um review sobre o escritor
* `numeroDeLivros` - Identifica a quantidade de livros do escritor na biblioteca