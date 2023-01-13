/**
 * Definições mais comuns de intervalos (ranges) no Kotlin.
 *
 * @see [Ranges](https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges)
 */
fun main() {
    for(i in 0..3) {  //incrementa de 0 até 3 incluindo o próprio 3
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {  //incrementa de 0 até 3 excluindo 3.
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {  //incrementa de forma personalizada, saltando em valores especificados.
        print(i)
    }
    print(" ")

    for(i in 3 downTo 0) {
        print(i)
    }
    print(i)
 }
 