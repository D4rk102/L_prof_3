import kotlin.random.Random

fun main() {
    // Variables para los jugadores individuales
    var player1Alive = true
    var player2Alive = true
    var player3Alive = true
    var player4Alive = true
    var player5Alive = true
    var player6Alive = true

    var bulletPosition = Random.nextInt(1, 7)  // Posición de la bala en el tambor (1-6)
    var currentChamber = 1  // Cámara actual

    while (player1Alive && player2Alive && player3Alive && player4Alive && player5Alive && player6Alive) {
        if (player1Alive) {
            println("Jugador 1 toma el arma...")
            if (currentChamber == bulletPosition) {
                println("¡Bang! Jugador 1 ha sido eliminado.")
                player1Alive = false
            } else {
                println("Jugador 1 sobrevive.")
            }
            currentChamber++
        }

        if (player2Alive && player1Alive && player3Alive && player4Alive && player5Alive && player6Alive) {
            if (player2Alive) {
                println("Jugador 2 toma el arma...")
                if (currentChamber == bulletPosition) {
                    println("¡Bang! Jugador 2 ha sido eliminado.")
                    player2Alive = false
                } else {
                    println("Jugador 2 sobrevive.")
                }
                currentChamber++
            }
        }

        if (player3Alive && player1Alive && player2Alive && player4Alive && player5Alive && player6Alive) {
            if (player3Alive) {
                println("Jugador 3 toma el arma...")
                if (currentChamber == bulletPosition) {
                    println("¡Bang! Jugador 3 ha sido eliminado.")
                    player3Alive = false
                } else {
                    println("Jugador 3 sobrevive.")
                }
                currentChamber++
            }
        }

        if (player4Alive && player1Alive && player2Alive && player3Alive && player5Alive && player6Alive) {
            if (player4Alive) {
                println("Jugador 4 toma el arma...")
                if (currentChamber == bulletPosition) {
                    println("¡Bang! Jugador 4 ha sido eliminado.")
                    player4Alive = false
                } else {
                    println("Jugador 4 sobrevive.")
                }
                currentChamber++
            }
        }

        if (player5Alive && player1Alive && player2Alive && player3Alive && player4Alive && player6Alive) {
            if (player5Alive) {
                println("Jugador 5 toma el arma...")
                if (currentChamber == bulletPosition) {
                    println("¡Bang! Jugador 5 ha sido eliminado.")
                    player5Alive = false
                } else {
                    println("Jugador 5 sobrevive.")
                }
                currentChamber++
            }
        }

        if (player6Alive && player1Alive && player2Alive && player3Alive && player4Alive && player5Alive) {
            if (player6Alive) {
                println("Jugador 6 toma el arma...")
                if (currentChamber == bulletPosition) {
                    println("¡Bang! Jugador 6 ha sido eliminado.")
                    player6Alive = false
                } else {
                    println("Jugador 6 sobrevive.")
                }
                currentChamber++
            }
        }

        // Reiniciar la ronda
        if (currentChamber > 6) {
            bulletPosition = Random.nextInt(1, 7)
            currentChamber = 1
        }
    }

    // Determinar el ganador
    when {
        player1Alive -> println("El juego ha terminado. Jugador 1 es el ganador.")
        player2Alive -> println("El juego ha terminado. Jugador 2 es el ganador.")
        player3Alive -> println("El juego ha terminado. Jugador 3 es el ganador.")
        player4Alive -> println("El juego ha terminado. Jugador 4 es el ganador.")
        player5Alive -> println("El juego ha terminado. Jugador 5 es el ganador.")
        player6Alive -> println("El juego ha terminado. Jugador 6 es el ganador.")
    }
}
