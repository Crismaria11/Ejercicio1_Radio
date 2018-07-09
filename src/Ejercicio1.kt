package main


class Default(
        private val Estado: String,
        private val Volumen: Int,
        private val Estacion: String,
        private val Estado2: String,
)
fun main(args : Array<String>) {





    val radioDefault = Default(
            Estado = apagado,
            Volumen = 2,
            Estacion = FM,
            Estado2 = salir
    )

    println(radioDefault)

}