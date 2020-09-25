class Collection(override var codigo: Long, override var quantidade: Int) : Livros{
    var pacote: MutableList<Livro> = mutableListOf()

    fun criarPacote(livro: Livro) {
        pacote.add(livro)
    }

    override fun mostr(): String{
        return ""
    }

    fun criarPacote(vararg livros: Livro) = livros.forEach { criarPacote(it) }


    override fun toString(): String {
        return "\nCodigo do Pacote: $codigo\nQuantidade: $quantidade\n\nLivros:\n"
    }


    fun mostrar(){
        pacote.forEach { println("${it.mostr()}")}
    }

    override fun venda(num: Int) {
        super.venda(num)
    }




}