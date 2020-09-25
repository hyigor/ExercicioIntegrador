class PacoteLivro(var pacote: MutableList<Livro> = mutableListOf(),
                  override var codigo: Long, override var quantidade: Int) : Livros{


    override fun toString(): String {
        return "Codigo do Pacote: $codigo\n"
                "Livros no pacote: ${pacote.toString()}"
    }

    override fun venda(num: Int) {
        super.venda(num)
    }




}