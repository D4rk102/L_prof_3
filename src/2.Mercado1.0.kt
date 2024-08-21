fun main() {

    var n: Int;
    var nom: String;
    var c: Int;
    var suma: Int;
    var t: Int

    /*
    println("Bienvenido")
    println("Ingrese su nombre")
    nom= readln().toString()

    println("Ingrese su Nit o CC")
    c= readln().toInt()

    println("Ingrese su teléfono")
    t= readln().toInt()
    */

    println("Elija con un número")
    println("1 - Mouse = 52000")
    println("2 - Teclado = 84000")
    println("3 - Monitor = 79000")
    println("4 - Disco duro = 24000")
    println("5 - Ver Factura")
    n = readln().toInt()
    println(n)

    while (n > 0) {
        when (n) {
            1 -> {
                var n1=52000
                println("Seleccionó Mouse $n1")
            }

            2 -> {
                var n2=84000
                println("Seleccionó Teclado $n2")
            }

            3 -> {
                var n3=79000
                println("Seleccionó Teclado $n3")
            }

            4 -> {
                var n4=24000
                println("Seleccionó Teclado $n4")
            }

            5 -> {
                println("Seleccionó Factura $")
            }

        }
    }
        println("Gracias por su compra")
}