class Livro(override var codigo: Long, val titulo: String, val autor: String,
                 val anoLançamento: String, var quantidade: Int, var preco: Double) : Livros{

    override fun toString(): String {
        return "Codigo: $codigo\nTitulo: $titulo\nAutor: $autor\nAno de lançamento: $anoLançamento\nQuantidade: $quantidade\nPreço: $preco\n"
    }

}