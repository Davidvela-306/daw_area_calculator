import kotlin.math.PI

fun main() {
    while (true) {
        try {
            // Menú de opciones
            println("Selecciona una opción para calcular el área:")
            println("1. Cuadrado")
            println("2. Círculo")
            println("3. Triángulo")
            println("0. Salir")
            
            // Leer la opción seleccionada
            when (readLine()?.toIntOrNull()) {
                1 -> calcularAreaCuadrado()
                2 -> calcularAreaCirculo()
                3 -> calcularAreaTriangulo()
                0 -> {
                    println("Saliendo...")
                    break
                }
                else -> println("Opción no válida. Intenta de nuevo.")
            }
        } catch (e: Exception) {
            println("Ha ocurrido un error: ${e.message}")
        }
        println("\n******************************\n") 
    }
}

fun calcularAreaCuadrado() {
    println("Introduce el lado del cuadrado:")
    val lado = readLine()?.toDoubleOrNull()
    
    if (lado != null && lado > 0) {
        val area = lado * lado
        println("El área del cuadrado es: $area")
    } else {
        println("Valor inválido para el lado.")
    }
}

fun calcularAreaCirculo() {
    println("Introduce el radio del círculo:")
    val radio = readLine()?.toDoubleOrNull()

    if (radio != null && radio > 0) {
        val area = PI * radio * radio
        println("El área del círculo es: $area")
    } else {
        println("Valor inválido para el radio.")
    }
}

fun calcularAreaTriangulo() {
    println("Introduce la base del triángulo:")
    val base = readLine()?.toDoubleOrNull()
    
    println("Introduce la altura del triángulo:")
    val altura = readLine()?.toDoubleOrNull()

    if (base != null && base > 0 && altura != null && altura > 0) {
        val area = (base * altura) / 2
        println("El área del triángulo es: $area")
    } else {
        println("Valor inválido para la base o la altura.")
    }
}
