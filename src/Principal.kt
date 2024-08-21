fun main(){
    /*
    var Suma1 = Constructor(10.7,21.5)
    Suma1.suma()
    var Resta1 = Constructor(7.2,2.2)
    Resta1.resta()
    val Division1 = Constructor (12.6, 2.4)
    println(Division1.division())
    val Raiz1 = Constructor(4.0,4.0)
    Raiz1.raiz()
    val Cuadrado1 = Constructor(4.0,3.0)
    println((Cuadrado1.cuadrado()))
    */
    fun main(){
        val listaOperaciones = mutableListOf<operacionesClase>()

        listaOperaciones.add(operacionesClase(21.32, 47.2))

        listaOperaciones.forEach { operacion ->
            val resultadoSuma = operacion.suma()
            val resltadoDivision = operacion.division()
            println(resltadoDivision)
            val resultadoMitad = operacion.mitad(50)
            val resultadoCuadrado = operacion.cuadrado(10.3)
            println(resultadoCuadrado)

        }
    }
}