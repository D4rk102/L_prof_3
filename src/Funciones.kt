fun main(){


    val n1=5
    val n2=6

    fun suma(){
    val suma = n1+n2
        println("la suma es: $suma")
    }
    fun resta(){
    val resta = n1-n2
        println("la resta es: $resta")
    }

    fun div():Int{
        return n2/n1
    }

    fun raiz(x:Double){
        val r = Math.sqrt(x)
        println(r)
    }

    fun cuadrado(C:Double):String{
        return "El cuadrado es: ${Math.pow(C,2.0)}"

    }

    suma()
    resta()
    println(div())
    raiz(12.5)
    println(cuadrado(4.0))

}