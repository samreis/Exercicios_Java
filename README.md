# Lista de Exercício - POO 

- [Exercicio 01](#exercicio-01)
- [Exercicio 02](#exercicio-02)
- [Exercicio 03](#exercicio-03)
- [Exercicio 04](#exercicio-04)
- [Exercicio 05](#exercicio-05)
- [Exercicio 06](#exercicio-06)

## Exercicio 01

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


## Exercicio 02

1) Crie uma classe para representar uma pessoa com os atributos: nome, cpf, idade, peso e altura. Faça:

- Crie 2 métodos construtores com sobrecargas diferentes;
- Crie os métodos públicos necessários para sets e gets;
- Crie um método público para devolver uma String com a informação de todos os valores contidos nos atributos (dados) de uma pessoa - método toString();

2) Crie um classe Teste (com Main). Nesta classe crie 4 pessoas com valores diferentes para os atributos.

- Na classe Teste apresente os dados da pessoa mais velha. Utilize estruturas condicionais.
- Dê um aumento de 5% para o peso das pessoas na faixa etária de 24 a 38 anos que estejam abaixo de 50 kg. Exiba os dados de todas as pessoas que tiveram alteração no peso.

## Exercicio 03

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

## Exercicio 04

1) Em um banco, para se cadastrar uma conta bancária, é necessário informar:

- número da conta
- nome do titular da conta
- valor de depósito incial que o titular depositou ao abrir a conta

Este valor de depósito incial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero. 

⚠️ Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo).

Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa de R$ 5,00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.

Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação. 

## Exercicio 05



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

## Exercicio 06

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



