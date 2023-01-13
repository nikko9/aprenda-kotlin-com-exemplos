/**
 * Intervalos (ranges) pode ser utilizados em estruturas condicionais, como o [if].
 *
 * @see [Ranges](https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges)
 */
fun main() {
    val x = 2
    if (x in 1..5) {
        print("x está entre 1 e 5")
    }
    println()

    if (x !in 6..10) {
        print("x nao esta entre 6 e 10")
    }
 }