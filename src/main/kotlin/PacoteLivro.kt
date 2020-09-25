class PacoteLivro(override var codigo: Long, override var quantidade: Int) : Livros{
    var pacote: MutableList<Livro> = mutableListOf()

    fun criarPacote(livro: Livro) {
        pacote.add(livro)
    }

    override fun pica(): String{
        return ""
    }

    fun criarPacote(vararg livros: Livro) = livros.forEach { criarPacote(it) }


    override fun toString(): String {
        return "Codigo do Pacote: $codigo\nLivros:\n"
    }


    fun mostrar(){
        pacote.forEach {println("${it.pica()}")}
    }

    override fun venda(num: Int) {
        super.venda(num)
    }




}