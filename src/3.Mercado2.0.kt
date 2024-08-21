fun main() {
    // Datos del cliente
    println("Ingrese su NIT:")
    val nit = readLine()!!
    println("Ingrese su nombre:")
    val nombre = readLine()!!
    println("Ingrese su teléfono:")
    val telefono = readLine()!!

    // Variables para almacenar las cantidades de cada producto
    var cantProducto1 = 0
    var cantProducto2 = 0
    var cantProducto3 = 0
    var cantProducto4 = 0

    // Precios ficticios de los productos
    val precioProducto1 = 5000.0
    val precioProducto2 = 15000.0
    val precioProducto3 = 12000.0
    val precioProducto4 = 10000.0

    // Variable para la opción del menú
    var opcion: Int

    // Menú de compra
    do {
        println("\n*** MENÚ DE COMPRA ***")
        println("1. Comprar Producto 1 - $${precioProducto1}")
        println("2. Comprar Producto 2 - $${precioProducto2}")
        println("3. Comprar Producto 3 - $${precioProducto3}")
        println("4. Comprar Producto 4 - $${precioProducto4}")
        println("5. Finalizar compra y mostrar factura")
        println("Seleccione una opción:")
        opcion = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                println("Ingrese la cantidad de Producto 1 que desea comprar:")
                val cantidad = readLine()!!.toInt()
                cantProducto1 += cantidad
                println("Ha añadido $cantidad de Producto 1 a su carrito.")
            }
            2 -> {
                println("Ingrese la cantidad de Producto 2 que desea comprar:")
                val cantidad = readLine()!!.toInt()
                cantProducto2 += cantidad
                println("Ha añadido $cantidad de Producto 2 a su carrito.")
            }
            3 -> {
                println("Ingrese la cantidad de Producto 3 que desea comprar:")
                val cantidad = readLine()!!.toInt()
                cantProducto3 += cantidad
                println("Ha añadido $cantidad de Producto 3 a su carrito.")
            }
            4 -> {
                println("Ingrese la cantidad de Producto 4 que desea comprar:")
                val cantidad = readLine()!!.toInt()
                cantProducto4 += cantidad
                println("Ha añadido $cantidad de Producto 4 a su carrito.")
            }
            5 -> {
                println("Finalizando compra...")
            }
            else -> {
                println("Opción no válida. Por favor, elija una opción del 1 al 5.")
            }
        }
    } while (opcion != 5)

    // Calcular los totales
    val totalProducto1 = cantProducto1 * precioProducto1
    val totalProducto2 = cantProducto2 * precioProducto2
    val totalProducto3 = cantProducto3 * precioProducto3
    val totalProducto4 = cantProducto4 * precioProducto4
    val totalNeto = totalProducto1 + totalProducto2 + totalProducto3 + totalProducto4
    val iva = totalNeto * 0.19
    val totalConIva = totalNeto + iva

    // Mostrar factura
    println("\n*** FACTURA ***")
    println("NIT: $nit")
    println("Nombre: $nombre")
    println("Teléfono: $telefono")
    println("----------------------------")
    println("Producto   Cantidad   Valor Unitario   Total")
    if (cantProducto1 > 0) {
        println("Producto 1   $cantProducto1          $${precioProducto1}       $${totalProducto1}")
    }
    if (cantProducto2 > 0) {
        println("Producto 2   $cantProducto2          $${precioProducto2}       $${totalProducto2}")
    }
    if (cantProducto3 > 0) {
        println("Producto 3   $cantProducto3          $${precioProducto3}       $${totalProducto3}")
    }
    if (cantProducto4 > 0) {
        println("Producto 4   $cantProducto4          $${precioProducto4}       $${totalProducto4}")
    }
    println("----------------------------")
    println("Total Neto: $${"%.2f".format(totalNeto)}")
    println("IVA (19%): $${"%.2f".format(iva)}")
    println("Total con IVA: $${"%.2f".format(totalConIva)}")
    println("Gracias por su compra!")
}