import kotlin.random.Random

fun main (){
    /*
    var n1:Int;var n2:Int

    n1= Random.nextInt(100)
    println(n1)
    n2=Random.nextInt(5,15)
    println(n2)

    var suma = n1+ n2
    println(suma)
    */
    var rd1 = 0
    var rd2 = 0

    for (i in 1 .. 5){

        var d1=Random.nextInt(1,7)
        var d2=Random.nextInt(1,7)

        if(d1>d2){
            rd1++
            println("Ronda $i")
            println("dado 1= $d1")
            println("dado 2= $d2")
            println("ganador dado1 con $rd1 puntos")
            println("perdedor dado2 con $rd2 puntos")
            println("")

        }else if(d2>d1){
            rd2++
            println("Ronda $i")
            println("dado 2= $d2")
            println("dado 1= $d1")
            println("ganador dado2 con $rd2 puntos")
            println("perdedor dado1 con $rd1 puntos")
            println("")
        }else{
            println("Ronda $i")
            println("dado 1= $d1")
            println("dado 2= $d2")
            println("Empataron, dado 1 con $rd1 puntos y dado 2 con $rd2 puntos")
            println("")
        }
    }
    if(rd1>rd2){

        println("El ganador es el dado 1 con $rd1 puntos")
        println("")

    }else if(rd2>rd1){

        println("El ganador es el dado 2 con $rd2 puntos")
        println("")
    }else{
        println("Empate con dado1 $rd1 puntos y dado 2 con $rd2 puntos")
    }
}