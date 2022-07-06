# Java Polimorfismo: Entenda Herança E Interfaces

Esse é o meu terceiro curso em Java, estou estudando a formação Java E Orientação À Objetos.

* [Link da formação](https://www.alura.com.br/formacao-java).
* [Link do curso](https://www.alura.com.br/curso-online-java-heranca-interfaces-polimorfismo).

Leituras recomendadas:
* Robert C Martin - Clean Code

## Links importantes
### Sobre Herança

### Sobre Polimorfismo
*	[DEVMEDIA - Uso de polimorfismo em java](https://www.devmedia.com.br/uso-de-polimorfismo-em-java/26140).
*	[UNIVERSIDADEJAVA - Java polimorfismo](http://www.universidadejava.com.br/java/java-polimorfismo/).
*	[W3SCHOOLS - Java plymorphism](https://www.w3schools.com/java/java_polymorphism.asp).

Implementação daquilo que estou aprendendo:
* Aplicarei aquilo que aprendi no Package `biblioteca` 
* A descrição do projeto pode ser vista à baixo

# Projeto Biblioteca

#### Aplicando o conceito de herança
`Chefe:` Olha, Pedrinho, estou pensando em criar uma biblioteca virtual, a principio 
eu gostaria de ter um cadastro de Leitore e Escritores, onde esses compartilhasem alguns 
atributos, por exemplo nome, sobrenome. Você da conta do recado?

#### Aplicando o conceito de sobrescrita e a utilização do super
`Chefe:` Tive uma outra ideia legal, e se existisse um esquema de pontuação dentro da 
biblioteca, algo como, se o usuário possuir um cadastro ganha 10% de bonus sobre a sua pontuação. 
Se ele for um leitor, ganha 30% além dos 10%, ou seja 40% sobre a pontuação. Se for escritor 50%,
mais 50% sobre o bonus do cadastro de usuário. 

#### Aplicando o conceito de polimorfismo
`Chefe:` Olha; pode ser legal; Imagina se a classe pudesse "falar" quem ela é e a sua 
pontuação? Consegue fazer isso? O desafio maior é, não repetir código.

#### Aplicando o conceito sobre herança de construtores
`Chefe:` Nosso projeto está ficando legal, agora quero que seja obrigatório informar o 
nome e sobrenome das pessoas que forem cadastradas em nossa base. 

#### Aplicando o conceito de classes e métodos abstratos
`Chefe:` Nossa biblioteca virtual está boa, mas pode melhorar. Não acho legal ser possível 
existir uma "pessoa" em nosso sistema. O ideal seria termos somente leitores e escritores. 
E estou repensando a pontuação bonus, ninguém deve ter 10% de bonus por ter um cadastro, 
mas todos devem possuir os bonus anteriores. 

## Documentação das Classes

### Pessoa abstract
Atributos:
* `nome` - Primeiro nome da pessoa
* `sobrenome` - Demais nomes
* `pontuacao` - pontuação ganha dentro da biblioteca. 

Funções:
* `getPontuacaoComBonus` - `abstract` - retorna a pontuação com o bonus da classe
* `getApresentacao` - retorna a mensagem de apresentação da classe

Validações:
* O atributo `nome` **não pode** permitir a insersão de duas palavras

Construtores:
* `Pessoa` - recebe nome e sobrenome

### Leitor
Atributos:
* `senha` - Senha do leitor
* `status` - Status atual do leitor

Funções:
* `getPontuacaoComBonus` - retorna a pontuação com o bonus da classe
* `getApresentacao` - retorna a mensagem de apresentação da classe

Construtores:
* `Leitor` - recebe nome e sobrenome

### Escritor
Atributos:
* `possuiReview` - Identifica se já foi escrito um review sobre o escritor
* `numeroDeLivros` - Identifica a quantidade de livros do escritor na biblioteca

Funções:
* `getPontuacaoComBonus` - retorna a pontuação com o bonus da classe
* `getApresentacao` - retorna a mensagem de apresentação da classe

Construtores:
* `Escritor` - recebe nome e sobrenome

### Apresentação
Funções:
* `getApresentacao` - retorna a mensagem de apresentação da pessoa que foi passada como parâmetro