
interface Edson {
    fun beijo(vararg receptores: String)
}

interface Andre {
    fun fazerPrograma(){
        println("Fazendo programa \uD83E\uDD13\uD83D\uDCBB ")
    }
}

abstract class Professor {
    abstract fun aula()
}

abstract class James {
    abstract fun saladaDeFruta()
}

class Agord: Andre, Edson, Professor(){
    override fun aula() {
        println("Aula boa é aula curta")
    }

    override fun beijo(vararg receptores: String) {
        for(i in receptores){
            println("Agord e Edson beijaram $i")
        }
    }
}

class Solange: James(), Edson, Andre {
    override fun beijo(vararg receptores: String) {
        for(i in receptores){
            println("Mas o q???? $i")
        }
    }

    override fun saladaDeFruta() {
        println("\u001b[31m" + "James" + "\u001b[0m" + " esta trazendo sua salada de fruta \uD83D\uDE04")
    }

}


fun main() {
    val Agord = Agord()
    Agord.aula();
    Agord.beijo("Thomas", "Zé Carlos")
    Agord.fazerPrograma()

    val Solange = Solange()
    Solange.saladaDeFruta()//tá bom???
    Solange.beijo("Agord", "Agord", "Agord")
}