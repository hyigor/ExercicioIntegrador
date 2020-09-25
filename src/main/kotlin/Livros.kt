interface Livros {
    var codigo: Long
    var quantidade: Int

    fun pica(): String

    fun venda(num: Int){
        this.quantidade = quantidade - num
    }


}