interface Livros {
    var codigo: Long
    var quantidade: Int

    fun venda(num: Int){
        this.quantidade = quantidade - 1
    }


}