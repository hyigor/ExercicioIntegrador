interface Livros {
    var codigo: Long
    var quantidade: Int

    fun mostr(): String

    fun venda(num: Int){
        this.quantidade = quantidade - num
    }


}