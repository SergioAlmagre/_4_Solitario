
class Baraja<TIPO> {

    class Nodo<TIPO>(var dato: TIPO?){
        var sig:Nodo<TIPO>? = null
    }

    var pri: Nodo<TIPO>? = null
    var fin: Nodo<TIPO>? = null


    override fun toString(): String {
        var cad = ""
        var aux = this.pri
        while (aux != null){
            cad = aux.dato.toString() + "\n" + cad
            aux = aux.sig
        }
        return cad
    }

    fun addfirst(dato: TIPO?){
        var nuevo: Nodo<TIPO> = Nodo(dato)
        if (this.pri == null){
            this.pri = nuevo
            this.fin = nuevo
        }else{
            nuevo.sig = this.pri
            this.fin = this.pri!!.sig
            this.pri = nuevo
        }
    }

    fun addLast(dato:TIPO?){
        var nuevo: Nodo<TIPO> = Nodo(dato)
        if (this.pri == null){
            this.pri = nuevo
            this.fin = nuevo
        }else{
            this.fin!!.sig = nuevo
            this.fin = nuevo
        }
    }

    fun pop():TIPO?{
        var dato:TIPO? = null
        if (this.pri != null){
            dato = this.pri!!.dato
            this.pri = this.pri!!.sig
        }
        return dato
    }

    fun barajar(){
        var barajaAux = ArrayList<TIPO>()
        var aux = this.pri
        while (aux != null){
            barajaAux.add(aux.dato!!)
            aux = aux.sig
        }
        barajaAux.shuffle()

        this.pri = null
        this.fin = null

        for (i in 0..barajaAux.size-1){
            var nuevo: Nodo<TIPO> = Nodo(barajaAux.get(i))
            if (this.pri == null){
                this.pri = nuevo
                this.fin = nuevo
            }else{
                this.fin!!.sig = nuevo
                this.fin = nuevo
            }
        }

    fun isEmpty():Boolean{
        var nothing: Boolean = false
        if (this.pri == null){
            nothing = true
        }
        return nothing
    }



    }

}