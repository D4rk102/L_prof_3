import kotlin.random.Random

fun main() {

    var rp1 = 0
    var rp2 = 0
    var emp = 0

    while (rp1 <= 2 && rp2 <=2) {
        var player1 = Random.nextInt(1, 4)
        var player2 = Random.nextInt(1, 4)
        var game1=player1
        var game2=player2
        var gr1=""
        var gr2=""

when (game1) {

    1 -> {
        gr1 = "Piedra"
    }

    2 -> {
        gr1 = "Papel"
    }

    3 -> {
        gr1 = "Tijeras"
    }
}
    when (game2) {

        1 -> {
            gr2 = "Piedra"
        }

        2 -> {
            gr2 = "Papel"
        }

        3 -> {
            gr2 = "Tijeras"
        }
    }
        if (game1 == 1 && game2 == 2) {
            rp1++
            println("El ganador es player2 = $gr2 frente a player1 = $gr1")
            println("Puntaje: player1 = $rp1   player2 = $rp2\n")


        } else if (game1 == 2 && game2 == 1) {
            rp2++
            println("El ganador es player2 = $gr2 frente a player1 = $gr1")
            println("Puntaje: player1 = $rp1   player2 = $rp2\n")

        }else if (game1 == 2 && game2 == 3) {
            rp1++
            println("El ganador es player1 = $gr1 frente a player2 = $gr2")
            println("Puntaje: player1 = $rp1   player2 = $rp2\n")

        }else if (game1 == 3 && game2 == 2) {
            rp1++
            println("El ganador es player2 = $gr2 frente a player1 = $gr1")
            println("Puntaje: player1 = $rp1   player2 = $rp2\n")
        }

        else if (game1 == 1 && game2 == 3) {
            rp1++
            println("El ganador es player1 = $gr1 frente a player2 = $gr2")
            println("Puntaje: player1 = $rp1   player2 = $rp2\n")

        } else if (game1 == 3 && game2 == 1) {
            rp2++
            println("El ganador es player2 = $gr2 frente a player1 = $gr1")
            println("Puntaje: player1 = $rp1   player2 = $rp2\n")

        }else if(game1 == 1 && game2 == 1){
            emp++
            println("Empate")
            println("Puntaje: player1 = $rp1   player2 = $rp2\n")

        }else if(game1 == 2 && game2 == 2){
            emp++
            println("Empate")
            println("Puntaje: player1 = $rp1   player2 = $rp2\n")

        }else if(game1 == 3 && game2 == 3){
            emp++
            println("Empate")
            println("Puntaje: player1 = $rp1   player2 = $rp2\n")
        }
    }
    if(rp1>rp2){
        println("El ganador es el player1 = $rp1 ganados")
    }else if(rp2>rp1){
        println("El ganador es el player2 = $rp1 ganados")
    }
}