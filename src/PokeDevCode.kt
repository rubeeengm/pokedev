import java.util.*

enum class Pokemones(val id: Int) {
    BULLBASUR(1), CHARMANDER(2), SQUIRTLE(3), PIKACHU(4)
}

fun main(args: Array<String>) {
    println("Elige un pokemón: ")

    for ((index, p) in Pokemones.values().withIndex()){
        println("${ index + 1 }) $p")
    }

    val scanner = Scanner(System.`in`)
    val opcion = scanner.nextInt()

    val pokemon : Pokemon = generarPokemon(opcion)

    mostrarDatos(pokemon)
}

fun generarPokemon(opcion: Int): Pokemon = when(opcion) {
    Pokemones.BULLBASUR.id -> Pokemon("Bulbasaur", 45, 49, 49, arrayOf(Ataque("vine whip",45), Ataque("tackle",40)))
    Pokemones.CHARMANDER.id -> Pokemon("Charmander", 39, 52, 43,  arrayOf(Ataque("scractch",40), Ataque("ember",40)))
    Pokemones.SQUIRTLE.id -> Pokemon("Squirtle", 44, 48, 65, arrayOf(Ataque("tackle",45), Ataque("watergun",40)))
    Pokemones.PIKACHU.id -> Pokemon("Pikachu", 35, 55, 40, arrayOf(Ataque("thunder shock",40), Ataque("quick attack",46)))

    else-> Pokemon("Missingno", 33, 136, 0, arrayOf(Ataque("pay day",20), Ataque("blind",15)))
}

fun mostrarDatos(pokemon: Pokemon) {
    println("Has elegido a ${pokemon.nombre} \n HP:${pokemon.hp} \n ATAQUE:${pokemon.ataque} \n DEFENSA:${pokemon.defensa}\n")
}