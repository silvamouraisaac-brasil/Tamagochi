# 🐉 Simulador de Animal de Estimação Virtual

> Um bichinho de bolso hoje... um dragão amanhã! 🔥

## 📖 Sobre o Projeto

O **Simulador de Animal de Estimação Virtual** é um projeto desenvolvido em Kotlin com o objetivo de praticar conceitos de Programação Orientada a Objetos (POO).

Nele, o jogador pode cuidar de um bichinho virtual, alimentando, brincando e ajudando-o a descansar. Conforme o tempo passa, o pet envelhece, desenvolve novas habilidades e evolui até se transformar em um dragão!

## 🎮 Funcionalidades

* Alimentar o bichinho para diminuir sua fome.
* Brincar para aumentar sua felicidade.
* Descansar para diminuir seu cansaço.
* Verificar o status atual do pet.
* Simular a passagem do tempo.
* Acompanhar o crescimento e as evoluções do bichinho.
* Vencer o jogo ao alcançar a idade 50.
* Perder caso a fome ou o cansaço chegue a 100, ou a felicidade chegue a 0.

## 🐣 Sistema de Evolução

O bichinho desbloqueia novas características conforme envelhece.

| Idade | Evolução                               |
| ----- | -------------------------------------- |
| 0     | 🐣 Bichinho inicial                    |
| 10    | Ganha chifres                          |
| 20    | Ganha uma asa                          |
| 30    | Aprende a cuspir fogo                  |
| 40    | Dobra de tamanho                       |
| 50    | 🐉 Transforma-se em um dragão completo |

## 📊 Regras do Jogo

### Passagem do Tempo

A cada ciclo, os atributos do bichinho são alterados:

* **Fome:** aumenta em 3 pontos.
* **Felicidade:** diminui em 3 pontos.
* **Cansaço:** aumenta em 10 pontos.
* **Idade:** aumenta em 1 ano.

### Condições de Derrota

O jogador perde se:

* A fome atingir 100.
* O cansaço atingir 100.
* A felicidade chegar a 0.

### Objetivo

Cuidar do bichinho até que ele alcance a idade 50 e se transforme em um dragão!

## 🛠️ Tecnologias Utilizadas

* Kotlin
* Programação Orientada a Objetos (POO)

## 📚 Conceitos Praticados

* Classes e objetos.
* Atributos e métodos.
* Estruturas condicionais (`if` e `else`).
* Estruturas de repetição (`while`).
* Estrutura de seleção (`when`).
* Entrada de dados pelo terminal.
* Encapsulamento de comportamentos em métodos.

## 📂 Estrutura do Projeto

```text
SeuProjeto/
└── src/
    └── main/
        └── kotlin/
            ├── Main.kt
            └── BichinhoVirtual.kt
```

### Arquivos

* **Main.kt:** contém o menu de interação e a execução principal do simulador.
* **BichinhoVirtual.kt:** contém a classe do bichinho, seus atributos, ações, evolução e condições de vitória e derrota.

## ▶️ Como Executar

1. Abra o projeto em uma IDE compatível com Kotlin, como o IntelliJ IDEA.
2. Certifique-se de que `Main.kt` e `BichinhoVirtual.kt` estejam no mesmo pacote.
3. Execute a função `main()` presente no arquivo `Main.kt`.
4. Digite o nome do seu bichinho.
5. Escolha as ações disponíveis no menu e cuide do seu pet!

## 🏆 Vitória

Ao alcançar a idade 50, seu bichinho desbloqueia sua evolução final:

# 🐉 DRAGÃO COMPLETO!

Cuide bem dele durante sua jornada... porque até os dragões precisam de carinho! 🔥
