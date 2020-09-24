class PacoteLivro(var pacote: MutableList<Livro> = mutableListOf(), override var codigo: Long) : Livros{


    override fun toString(): String {
        return "Codigo do Pacote: $codigo\n"
                "Livros no pacote: ${pacote.toString()}"
    }




}