
fun main() {

    println("Bem-vindo ao Simulador de Animal de Estimação Virtual!")
    println("Digite o nome do seu animal de estimação:")

    val nomePet = readLine() ?: "Funky"
    val pet = BichinhoVirtual(nomePet)

    while (true) {

        println("\nEscolha uma ação:")
        println("1. Alimentar $nomePet")
        println("2. Brincar com $nomePet")
        println("3. Verificar o status de $nomePet")
        println("4. Descansar $nomePet")
        println("5. Sair")

        val escolha = readLine()?.toIntOrNull()

        when (escolha) {
            1 -> pet.alimentar()
            2 -> pet.brincar()
            3 -> pet.verificarStatus()
            4 -> pet.descansar()
            5 -> {
                println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!")
                return
            }

            else -> {
                println("Escolha inválida. Tente novamente.")
                continue
            }
        }
        pet.passarTempo()
        if (pet.verificarDerrota()) {
            println("\nGAME OVER! Você não conseguiu cuidar de ${pet.nome}.")
            pet.verificarStatus()
            break
        }
        if (pet.verificarVitoria()) {
            println("\nParabéns! ${pet.nome} chegou à idade 50!")
            println("Você venceu o jogo!")
            pet.verificarStatus()
            break
        }
    }
}

