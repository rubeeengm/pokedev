enum class Pokemones(val id: Int) {
    BULLBASUR(1), CHARMANDER(2), SQUIRTLE(3), PIKACHU(4)
}

fun main(args: Array<String>) {
    println("Elige un pokemón: ")

    for ((index, p) in Pokemones.values().withIndex()){
        println("${ index + 1 }) $p")
    }
}