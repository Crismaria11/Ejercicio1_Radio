package main


class Default(
        private var Estado: String,
        private var Volumen: Int,
        private var Estacion: String,
        private var Estado2: String
) {
    fun getEstado(): String {
        return Estado
    }

    fun getVolumen(): Int {
        return Volumen
    }

    fun getEstacion():String{
      return Estacion
    }

    fun getEstado2():String{
      return Estado2
    }
}
fun main(args : Array<String>) {

    val radioDefault = Default(
            Estado = "Apagado",
            Volumen = 1,
            Estacion = "FM",
            Estado2 = "Salir"
    )
    println(radioDefault.getEstado())
    println(radioDefault.getVolumen())
    println(radioDefault.getEstacion())
    println(radioDefault.getEstado2())
}