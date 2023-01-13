/**
 * Verificações de igualdade.
 *
 * @see [Equality Checks](https://play.kotlinlang.org/byExample/02_control_flow/04_Equality%20Checks)
 */
fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)     //retorna true pois testa se os valores sao iguais ignorando a ordem dos elementos.
    println(authors === writers)    //retorna falso por fazer uma comparacao referencial.
 }