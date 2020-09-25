class Livro(override var codigo: Long, val titulo: String, val autor: String,
            val anoLançamento: String, override var quantidade: Int, var preco: Double) : Livros{

    override fun toString(): String {
        return "Codigo: $codigo\nTitulo: $titulo\nAutor: $autor\nAno de lançamento: $anoLançamento\nQuantidade: $quantidade\nPreço: $preco\n"
    }

    override fun venda(num: Int) {
        super.venda(num)
    }

}