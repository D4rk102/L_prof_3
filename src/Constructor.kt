class Constructor(var n1:Double, var n2:Double){
    fun suma() {
        var sum = this.n1 + this.n2
        println("La suma es  $sum")
    }

    fun resta(){
        var res = this.n1 - this.n2
        println("la resta es $res")
    }

    fun division():Double{
        return n1/n2
    }

    fun raiz(){

        val r = Math.sqrt(n1)
        println("La raíz de x es: $r")
    }

    fun cuadrado():String{
        return "El cuadrado es: ${Math.pow(n1,n2)}"
    }

}