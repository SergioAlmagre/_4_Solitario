fun main(args: Array<String>) {

    var manojo = Factoria.factoriaBaraja()
    var monton1 = Monton<Carta>()
    var monton2 = Monton<Carta>()
    var cartaAcoplada: Boolean = false
    var hasGanado: Boolean = false
    var montonCompletado: Int = 0

    manojo!!.barajar()

    while (!hasGanado) {
        cartaAcoplada = false
        var cartaElegida = manojo.pop()

//  PONER LA PRIMERA CARTA
        if (monton1.isEmpty() && cartaElegida!!.numero == 12) {
            monton1.push(cartaElegida)
            cartaAcoplada = true
            println("Carta colocada")
        }

        if (monton2.isEmpty() && !cartaAcoplada && cartaElegida!!.numero == 12) {
            monton2.push(cartaElegida)
            cartaAcoplada = true
            println("Carta colocada")
        }
//  COLOCAR LAS SIGUIENTES ALTERNANDO COLOR Y RESPETANDO EL NÚMERO
        if (!monton1.isEmpty()) {
            if (cartaElegida!!.color != monton1.peek()!!.color && cartaElegida.numero == monton1.peek()!!.numero - 1) {
                monton1.push(cartaElegida)
                cartaAcoplada = true
                println("Carta colocada")
                if (monton1!!.peek()!!.numero == 1) {
                    montonCompletado++
                }
            }
        }
        if (!monton2.isEmpty()) {
            if (cartaElegida!!.color != monton2.peek()!!.color && cartaElegida.numero == monton2.peek()!!.numero - 1){
                monton2.push(cartaElegida)
                cartaAcoplada = true
                println("Carta colocada")
                if (monton2!!.peek()!!.numero == 1) {
                    montonCompletado++
                }
            }
        }

//  COMPROBACIONES FINALES
            if (montonCompletado == 2) {
                hasGanado = true
            }
            if (!cartaAcoplada) {
                manojo.addLast(cartaElegida)
            }
    }

    println("\n¡Hecho!\n")
    println("$monton1\n$monton2")

}