# Java Polimorfismo: Entenda Heran�a E Interfaces

Esse � o meu terceiro curso em Java, estou estudando a forma��o Java E Orienta��o A Objetos.

* Link da forma��o: https://www.alura.com.br/formacao-java
* Link do curso: https://www.alura.com.br/curso-online-java-heranca-interfaces-polimorfismo

Leituras recomendadas:
* Robert C Martin - Clean Code

Implementa��o daquilo que estou aprendendo:
* Aplicarei aquilo que aprendi no Package `Biblioteca` 
* A descri��o do projeto pode ser vista � baixo

# Projeto Biblioteca
Em nossa biblioteca precisamos do cadastro para leitores e escritores, eles compartilharam alguns atributos em comum.

## Documenta��o das Classes

#### Pessoa
Atributos:
* `nome` - Primeiro nome da pessoa
* `sobrenome` - Demais nomes

Valida��es:
* O atributo `nome` **n�o pode** permitir a insers�o de duas palavras

### Leitor
Atributos:
* `senha` - Senha do leitor
* `status` - Status atual do leitor

### Escritor
Atributos:
* `possuiReview` - Identifica se j� foi escrito um review sobre o escritor
* `numeroDeLivros` - Identifica a quantidade de livros do escritor na biblioteca