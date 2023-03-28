class Monton<TIPO> {
    class Nodo<TIPO>(var dato:TIPO?){
        var sig: Nodo<TIPO>? = null
    }
    var mon:Nodo<TIPO>? = Nodo(null)


    override fun toString(): String {
        var cad = ""
        var aux = this.mon
        while (aux != null){
            cad = aux.dato.toString() + "\n" + cad
            aux = aux.sig
        }
        cad = "Montón " + cad
        return cad
    }

    fun push(e:TIPO){
        var nuevo: Nodo<TIPO>? = Nodo(e)
        if (this.mon == null){
            this.mon = nuevo
        }else{
            nuevo!!.sig = this.mon!!
            this.mon = nuevo
        }
    }

    fun isEmpty():Boolean{
        var nothing: Boolean = false
        if (this.mon!!.dato == null){
            nothing = true
        }
        return nothing
    }

    fun peek(): TIPO? {
        var carta: TIPO? = null

        if (this.mon != null){
            carta = this.mon!!.dato
        }
        return carta
    }



}