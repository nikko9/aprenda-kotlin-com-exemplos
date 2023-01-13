/**
 * Expressões condicionais (análogas a operadores ternários).
 *
 * @see [Conditional Expression](https://play.kotlinlang.org/byExample/02_control_flow/05_Conditional%20expression)
 */
fun main() {
    fun max(a: Int, b: Int) = if (a > b) a else b   //if é uma expressao aqui e retorna um valor.

    println(max(99, -42))
 }