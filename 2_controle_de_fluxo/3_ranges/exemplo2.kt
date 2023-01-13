/**
 * Intervalos (ranges) de caracteres.
 *
 * @see [Ranges](https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges)
 */
fun main() {
    for (c in 'a'..'d') {   //incrementa caracteres em ordem alfabetica.
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) {  //incremento em ordem inversa a alfabetica e saltando chars.
        print(c)
    }
    print(" ")
 }