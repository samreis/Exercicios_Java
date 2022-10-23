# Lista de Exercício - POO 

- [Exercicio 01](#exercicio-01)
- [Exercicio 02](#exercicio-02)
- [Exercicio 03](#exercicio-03)
- [Exercicio 04](#exercicio-04)
- [Exercicio 05](#exercicio-05)
- [Exercicio 06](#exercicio-06)
- [Exercicio 07](#exercicio-07)
- [Exercicio 08](#exercicio-08)
- [Exercicio 09](#exercicio-09)
- [Exercicio 10](#exercicio-10)
- [Exercicio 11](#exercicio-11)
- [Exercicio 12](#exercicio-12)
- [Exercicio 13](#exercicio-13)
- [Exercicio 14](#exercicio-14)

## Exercicio 01 - Cálculo de Salário

1) Escreva um modelo (classe) Empregado que represente um empregado de uma
empresa qualquer. Considere que os atributos nome, horasTrabalhadasNoMês e
salárioPorHora devam ser representados, e que ao menos a operação (método)
calculaSalárioMensal seja implementada.

2) Crie 2 métodos construtores.

3) Crie uma classe Teste (com main). Nesta classe crie 4 empregados com valores
diferentes para os atributos.

4) Na classe de teste agora apresente o valor do empregado que tem o maior salário.
Utilize estruturas condicionais.

5) Dê um aumento de 20% para os empregados que tem salário abaixo da média salarial
dos 4 empregados criados. Exiba os dados de todos os empregados.

6) Agora crie uma outra classe chamada TesteMenu. Nessa classe você deve exibir um
menu com as seguintes opções: 

 - Criar o empregado; 
 - Calcular salário do mensal;
 - Alterar horas trabalhadas no mês; 
 - Alterar salário do empregado; 
 - Sair.

O menu deve ser (re)exibido até que o usuário não deseje mais utilizar o sistema.
Quando o uso do sistema for encerrado pelo usuário, exibir uma mensagem do tipo
"Obrigado por utilizar o sistema".

⚠️ Observação: nessa classe TesteMenu deve ser possível criar apenas um empregado
e você irá trabalhar com ele, apenas.


## Exercicio 02 - Aplicação Simples 

1) Crie uma classe para representar uma pessoa com os atributos: nome, cpf, idade, peso e altura. Faça:

- Crie 2 métodos construtores com sobrecargas diferentes;
- Crie os métodos públicos necessários para sets e gets;
- Crie um método público para devolver uma String com a informação de todos os valores contidos nos atributos (dados) de uma pessoa - método toString();

2) Crie um classe Teste (com Main). Nesta classe crie 4 pessoas com valores diferentes para os atributos.

- Na classe Teste apresente os dados da pessoa mais velha. Utilize estruturas condicionais.
- Dê um aumento de 5% para o peso das pessoas na faixa etária de 24 a 38 anos que estejam abaixo de 50 kg. Exiba os dados de todas as pessoas que tiveram alteração no peso.

## Exercicio 03 - Conta bancária

1) Crie uma classe Conta que irá manipular contas de um banco. Siga a especificação:

**Atributos:**

- Número: número da conta
- Nome: nome do titular da conta
- Tipo: tipo da conta (poupança ou conta corrente)
- Saldo: o saldo da conta

**Construtores:**

|      Construtor     |      Parâmetros     |     Descrição                                                                                        |
| ------------------- | ------------------- |------------------------------------------------------------------------------------------------------|
|          1          |     Nenhum          | Inicializa o saldo com zero                                                                          |            
|          2          |   Número da conta / Nome do titular  |inicializa o saldo com zero e atribui o número da conta e o nome do titular a  conta |
                  
**Métodos:**
- Implemente os métodos de acesso para os atributos
- Além dos métodos de acesso, implemente os seguintes métodos abaixo:

|      Método         |      Parâmetros      |     Descrição                                                                                        |
| ------------------- | ---------------------|------------------------------------------------------------------------------------------------------|
|      Depositar      |Valor a ser depositado| Adiciona no saldo o valor passado                                                                    |            
|        Sacar        |Valor a ser sacado    |Retira do saldo o valor passado                                                                       |

2) Crie uma classe principal chamada Banco que vai manipular as contas. Este programa deve realizar tarefas:

> Criar uma conta simples de número 123 para o Zé Carioca

> Apresente o seguinte menu para o dono da conta Zé Carioca:

- Realizar depósito
- Realizar saque
- Mostrar saldo
- Mostrar informações do titular
- Sair

Além de apresentar o menu, cada opção de menu escolhida deve ser implementada

Exemplo: Caso o usuário escolha a opção de realizar depósito, o programa deve perguntar o valor que ele quer depositar e atualizar o saldo da conta do Zé Carioca.

## Exercicio 04 - Conta bancária II 

1) Em um banco, para se cadastrar uma conta bancária, é necessário informar:

- número da conta
- nome do titular da conta
- valor de depósito incial que o titular depositou ao abrir a conta

Este valor de depósito incial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero. 

⚠️ Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo).

Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa de R$ 5,00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.

Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação. 

## Exercicio 05 - Agenda

1. Crie uma classe Agenda que possa armazenar 10 pessoas e que seja
capaz de realizar as seguintes operações:

- void armazenaPessoa(String nome, int idade, float altura);
- void removePessoa(String nome);
- int buscaPessoa(String nome);
- informa em que posição da agenda está a pessoa;
- void imprimeAgenda();
- imprime os dados de todas as pessoas da agenda;
- void imprimePessoa(int index);
- imprime os dados da pessoa que está na posição “i” da agenda.

⚠️ (Exercicio realizado utilizando vetores)

## Exercicio 06 - Aluguel de Quartos

1) A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.

Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.

⚠️ (Exercicio realizado utilizando vetores)

## Exercicio 07 - Cervejaria

A aplicação proposta terá uma classe Cerveja que tem os seguintes atributos:
````java
// Atributos
- String nome;
- enum Tipo; // Criar um arquivo .java do tipo enum com as seguintes constantes: Pilsen, Lager, Pale Ale, Bock, Weissbier
- Float preco;
````
Também teremos a classe Cervejaria que tem os seguintes atributos e métodos:
````java
// Atributos
- List<Cerveja> cerveja;
- Map<Cerveja, Integer> estoque;
````
````java
// Métodos
- void compraCerveja(cerveja, quantidade)
- void listaCervejasCompradas() // Lista o nome, tipo e preco de cada cerveja comprada e sua quantidade
- void totalizaValorCervejasCompradas() // Mostra o valor total gasto somando todas as cervejas compradas
````
#### Regras

1. Os atributos da classe Cerveja só devem ser modificados através do construtor e
só pode ter métodos acessores.

#### Aplicação

Será criada a classe Aplicacao que conterá o seguinte menu:

1. Comprar cerveja
2. Listar cervejas compradas
3. Valor total gasto em reais das cervejas compradas
4. Encerrar aplicação

## Exercicio 08 - Serviço de Streaming

A aplicação proposta terá uma classe Serie que tem os seguintes atributos:
````java
// Atributos
- String nome; // nome da série
- String descrição; // descrição resumida da série
- int qtdTemporada; // quantidade de temporadas
- int qtdEpisodiosTemporada; // quantidade de episódios por temporada
````
````java
// Métodos
- void exibeDados() // exibe todos os valores de cada atributo da classe Serie
````
Também teremos a classe ServicoStreaming que tem os seguintes atributos e métodos:
````java
// Atributos
- String nome; // nome do serviço de streaming
- float valorMensal; // valor mensal pago ao serviço de streaming
- List<Serie> series; // séries que o serviço de streaming tem em seu catálogo
````
````java
// Métodos
- void adicionaUnicoServicoStreaming(String nome, float valorMensal) // adiciona único serviço de streaming
- void adicionaSerie(Serie serie) // adiciona uma série ao serviço de streaming
- void removeSerie(Serie serie) // remove uma série do serviço de streaming pelo nome
- void exibeSeriesCatalogo() // exibe todas as séries disponíveis no catálogo juntamente com todas as informações de cada série e mostra qual nome do serviço de streaming vinculado
- void exibeDados() // exibe os valores dos atributos nome e valorMensal do serviço de streaming adicionado
````
#### Regras

1. Os atributos da classe Serie só devem ser modificados através do construtor e
   só pode ter métodos acessores para seus atributos.

#### Aplicação

Será criada a classe Aplicacao que conterá o seguinte menu:

1. Adicionar único serviço de streaming
2. Adicionar série
3. Remover série pelo nome
4. Exibir séries do catálogo
5. Exibir dados do serviço de streaming
6. Encerrar aplicação

## Exercicio 09 - Cervejaria II

A aplicação proposta terá uma classe Cerveja que tem os seguintes atributos:
````java
// Atributos
- String marca;

- enum Tipo; // Criar um arquivo .java do tipo enum com as seguintes constantes: Pilsen, Lager, Pale Ale, Bock, Weissbier e conter um atributo chamado descrição
- Float preco;
````
Também teremos a classe Cervejaria que tem os seguintes atributos e métodos:
````java
// Atributos
- List<Cerveja> cerveja;
- Map<Cerveja, Integer> estoque;
````
````java
// Métodos
- void vendeCerveja(cerveja, quantidade)
- void listaCervejasVendidas() // Lista o nome, tipo e preco de cada cerveja vendida e sua quantidade
- void totalizaValorCervejasVendidas() // Mostra o valor total obtido somando todas as cervejas vendidas
````
#### Regras

1. Os atributos da classe Cerveja só devem ser modificados através do construtor e
só pode ter métodos acessores.

#### Aplicação

Será criada a classe Aplicacao que conterá o seguinte menu:

1. Vender cerveja
2. Listar cervejas vendidas
3. Valor total obtido em reais das cervejas vendidas
4. Encerrar aplicação

## Exercicio 10 - Herança Veículo

Implemente todo o código necessário para a criação das classes abaixo:

![img](https://res.cloudinary.com/practicaldev/image/fetch/s--wQrfviWE--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_880/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/y2w5ukxw5s8isu91qxhr.png)

Criar uma classe Veiculo, com os atributos placa e ano.
Vamos criar o construtor padrão e o vazio, getters/setters e a função exibir dados,
que vai apresentar um texto com os dados do veículo.

Criar a classe Onibus que estende Veiculo e terá o atributo assentos,
vamos criar o construtor vazio, construtor com super classe passando os
argumentos String placa e int ano,
getters/setters e o método dados para exibir os dados do Caminhão
(sobreescrita do método).

Criar a classe Caminhão que estende Veiculo e terá o atributo eixos,
vamos criar o construtor vazio, construtor com super classe passando os
argumentos String placa e int ano,
getters/setters e o método dados para exibir os dados do Caminhão
(sobreescrita do método).

Criar uma classe Teste para testarmos as classes que criamos.
Vamos criar um array de veículos, que armazenará todos os nossos objetos Veículos,
Caminhões e Onibus. E, por fim, vamos criar três laços de repetição para exibirmos
os dados dos objetos que criamos.

## Exercicio 11 -  Polimorfismo no Zoológico

1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a todos os animais fique na classe Animal:

![image](https://user-images.githubusercontent.com/89954378/140250313-e0380112-ad8f-4f2d-a791-cd3a1603860a.png)

2- Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e invoque o método que emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal.

3- Implemente uma classe Veterinario que contenha um método examinar() cujo parâmetro de entrada é um Animal, quando o animal for examinado ele deve emitir um som, passe os 3 animais com parâmetro.

4- Crie uma classe Zoologico, com 10 jaulas (utilize um array) coloque em cada jaula um animal diferente, percorra cada jaula e emita o som e, se o tipo de animal possuir o comportamento, faça-o correr.


## Exercicio 12 - Posto de Combustível

A aplicação proposta terá uma classe Combustivel que tem os seguintes atributos:
````java
private Tipo tipo;
private PrecoLitro preco;
private Float litros;

// Incluir construtor padrão e com argumentos e métodos acessores e modificadores.
````
Criar enum Tipo que será um atributo da classe Combustivel que tem as seguintes constantes e atributo:
````java
// Constantes
GASOLINA_COMUM("Gasolina comum"),
GASOLINA_ADITIVADA("Gasolina aditivada"),
ETANOL("Etanol"),
ETANOL_ADITIVADO("Etanol aditivado"),
DIESEL_COMUM("Diesel comum"),
DIESEL_ADITIVADO("Diesel aditivado");

// Atributos
private String descricao;

// Criar o construtor com argumento String nome e método acessor de nome.
````
Criar a classe PrecoLitro que será um atributo da classe Combustivel que tem o seguinte atributo:
````java
// Atributos
private Float valorReais;

// Incluir construtor padrão e com argumento e métodos acessor e modificador.
````
Criar a interface Posto com os seguintes métodos:
````java
// Métodos
void comprarCombustivel(Combustivel combustivel, String nomePosto);
void venderCombustivel(String nomePosto, Float litros);
void litrosRestantes(String nomePosto);
````
Criar a classe PostoImpl que implementa a interface Posto e contem os sequintes atibutos e métodos:
````java
// Atributos
private String nomePosto;
private Map<String, Combustivel> combustivel = new HashMap<>();

// Métodos
public void comprarCombustivel(Combustivel combustivel, String nomePosto);
public void venderCombustivel(String nomePosto, Float litros); // mostrar nome do posto, quantidade litros vendidos, nome do combustivel e valor da venda
public void litrosRestantes(String nomePosto); // mostrar nome do posto, quantidade litros restantes, nome do combustivel

// Incluir construtor padrão e com argumentos e métodos acessores e modificadores.
````
#### Regras

1. Os métodos acessores e modificadores de todas as classes que não forem utilizados devem ser
deletados.

#### Aplicação

Será criada a classe AppPosto que conterá o seguinte menu:

1. Comprar combustível para posto
2. Vender combustível do Posto
3. Mostrar litros de combustível restante do posto
4. Encerrar aplicação


## Exercicio 13- Recarga
Dado que um cliente deseja realizar uma recarga de celular. Implemente uma função que permita que o cliente realize uma recarga em sua linha onde o débito ocorrerá de sua conta.


Classe cliente
-----------------------------------------
Atribultos 

nome cliente;

numero de Telefone

saldo em conta 

saldo do telefone 


---------------------------------------
Métodos 

Fazer recarga

Fazer uma ligação - "Cada ligação cobra Dois reais"

Printar nome, numero, saldo em conta, saldo do telefone 

