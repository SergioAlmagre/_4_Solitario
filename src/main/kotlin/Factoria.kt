
object Factoria {

     fun factoriaBaraja():Baraja<Carta>?{
        var palos = arrayOf("Picas","Corazones","Diamantes","Treboles")
        var color = "Negras"
        var baraja = Baraja<Carta>()
        var palosTotales: Int = 4

        while (palosTotales != 0) {
            if (palosTotales <2) {
                color = "Rojas"
            }
                for (i in 1..12) {
                    var cartaGenerica = Carta(color,"",i,palos[palosTotales-1])
                    when (i){
                        10-> cartaGenerica.figura = "Caballero"
                        11-> cartaGenerica.figura = "Reina"
                        12-> cartaGenerica.figura = "Rey"
                    }
                    baraja!!.addfirst(cartaGenerica)
                }
                palosTotales--
        }
        return baraja
    }

}