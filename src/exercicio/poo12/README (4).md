## Java exercício POO — Posto de Combustível

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