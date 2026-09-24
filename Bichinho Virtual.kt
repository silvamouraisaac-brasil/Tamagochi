//TamagochiVirtual

class BichinhoVirtual(val nome: String) {

    var nivelDeFome = 50
    var nivelFelicidade = 50
    var cansaco = 0
    var idade = 0

    var temChifres = false
    var temAsa = false
    var cospeFogo = false
    var tamanhoDobrado = false
    var virouDragao = false

    fun alimentar() {

        nivelDeFome -= 10

        if (nivelDeFome < 0) {
            nivelDeFome = 0
        }
        println("$nome foi alimentado. O nível de fome diminuiu.")
    }
    fun brincar() {
        nivelFelicidade += 10
        cansaco += 10
        if (nivelFelicidade > 100) {
            nivelFelicidade = 100
        }
        if (cansaco > 100) {
            cansaco = 100
        }
        println("$nome está brincando e se sentindo mais feliz.")
        println("O nível de cansaço aumentou.")
    }
    fun descansar() {
        cansaco -= 20
        if (cansaco < 0) {
            cansaco = 0
        }
        println("$nome descansou. O nível de cansaço diminuiu.")
    }
    fun verificarStatus() {
        println("\n========== STATUS DE $nome ==========")
        println("Idade: $idade")
        println("Nível de fome: $nivelDeFome")
        println("Nível de felicidade: $nivelFelicidade")
        println("Nível de cansaço: $cansaco")
        println("\nEvolução:")
        if (virouDragao) {
            println("$nome é um dragão completo!")
        } else if (tamanhoDobrado) {
            println("$nome está com o dobro do tamanho!")
        } else if (cospeFogo) {
            println("$nome já consegue cuspir fogo!")
        } else if (temAsa) {
            println("$nome possui uma asa!")
        } else if (temChifres) {
            println("$nome possui chifres!")
        } else {
            println("$nome ainda é um bichinho em desenvolvimento.")
        }
        println("=====================================")
    }

    //evolução

    fun passarTempo() {
        nivelDeFome += 3
        nivelFelicidade -= 3
        cansaco += 10
        idade++
        if (nivelDeFome > 100) {
            nivelDeFome = 100
        }
        if (nivelFelicidade < 0) {
            nivelFelicidade = 0
        }
        if (cansaco > 100) {
            cansaco = 100
        }
        println("\nO tempo passou!")
        println("$nome está ficando mais velho.")

        verificarEvolucao()
    }
    fun verificarEvolucao() {
        if (idade == 10 && !temChifres) {
            temChifres = true
            println("\n=====================================")
            println("✨ EVOLUÇÃO!")
            println("$nome atingiu a idade 10!")
            println("Pequenos chifres começaram a crescer!")
            println("=====================================")
        }
        if (idade == 20 && !temAsa) {
            temAsa = true
            println("\n=====================================")
            println("✨ NOVA EVOLUÇÃO!")
            println("$nome atingiu a idade 20!")
            println("Uma asa surgiu em suas costas!")
            println("=====================================")
        }
        if (idade == 30 && !cospeFogo) {
            cospeFogo = true
            println("\n=====================================")
            println("🔥 NOVA HABILIDADE!")
            println("$nome atingiu a idade 30!")
            println("Agora ele consegue cuspir fogo!")
            println("=====================================")
        }
        if (idade == 40 && !tamanhoDobrado) {
            tamanhoDobrado = true
            println("\n=====================================")
            println("🐲 CRESCIMENTO!")
            println("$nome atingiu a idade 40!")
            println("Seu tamanho dobrou!")
            println("=====================================")
        }
        if (idade == 50 && !virouDragao) {

            virouDragao = true

            println("\n=====================================")
            println("🐉 EVOLUÇÃO FINAL!")
            println("$nome atingiu a idade 50!")
            println("SEU BICHINHO VIROU UM DRAGÃO!")
            println("=====================================")
        }
    }
    fun verificarDerrota(): Boolean {

        if (nivelDeFome >= 100 || cansaco >= 100 || nivelFelicidade <= 0) {
            return true
        }
        return false
    }
    fun verificarVitoria(): Boolean {
        if (idade >= 50) {
            return true
        }
        return false
    }
}
//A ideia foi transformar uma ideia do Gabriel e transformar ela em um Tamagochi real