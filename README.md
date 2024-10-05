# Agregação e Composição em Java

Este repositório contém dois exemplos de código que demonstram os conceitos de Agregação e Composição em Java. Esses conceitos são comumente usados em programação orientada a objetos (POO) para descrever como os objetos estão relacionados uns com os outros.

## Agregação

**descrição** <br>

O exemplo de Agregação envolve três classes principais:

- **Jogador**: Representa um jogador.
- **Equipe**: Representa uma equipe que pode ter vários jogadores.
- **AssociacaoEsportiva**: Representa uma associação esportiva que pode ter várias equipes.

No conceito de agregação, os objetos podem existir independentemente uns dos outros. Ou seja, uma Equipe pode existir sem um Jogador, e um Jogador pode existir sem estar vinculado a uma Equipe. Da mesma forma, uma AssociacaoEsportiva pode existir sem uma Equipe.

**Estrutura das Classes** <br>
- **Jogador**: Tem um atributo nome para armazenar o nome do jogador.
- **Equipe**: Tem um atributo nome e uma lista de jogadores. A Equipe pode adicionar jogadores usando o método adicionarJogador().
- **AssociacaoEsportiva**: Tem um atributo nome e uma lista de equipes. Pode adicionar equipes usando o método adicionarEquipe().

**Resultado**

```cmd
Equipes da associação Liga Nacional:
- Leões
Jogadores da equipe Leões:
- Pedro
- Carlos
```

## Composição

**descrição** <br>

O exemplo de Composição envolve três classes:

- **Motor**: Representa o motor de um automóvel.
- **Roda**: Representa as rodas de um automóvel.
- **Automovel**: Representa o automóvel que contém um motor e quatro rodas.

**Estrutura das Classes** <br>
- **Motor**: Não tem atributos, mas sim um método ligar() que simula o funcionamento do motor.
- **Roda**: Representa cada uma das quatro rodas do carro.
- **Automovel**: Contém um motor e quatro rodas. Quando um objeto Automovel é criado, ele automaticamente cria um motor e quatro rodas.

**Resultado**

```cmd
Motor criado.
Roda criada.
Roda criada.
Roda criada.
Roda criada.
Motor ligado.
Automóvel ligado.
```