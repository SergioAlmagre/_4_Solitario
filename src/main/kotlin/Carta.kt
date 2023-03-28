class Carta {

    var color:String
    var figura:String
    var palo:String
    var numero:Int

    constructor(color: String, figura: String, numero: Int, palo:String) {
        this.color = color
        this.figura = figura
        this.numero = numero
        this.palo = palo
    }

    constructor(){
        this.color = ""
        this.figura = ""
        this.numero = 0
        this.palo = ""
    }

    override fun toString(): String {
        return "Carta(color='$color', figura='$figura', palo='$palo', numero=$numero)"
    }

}