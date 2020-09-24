fun main() {
    var livro1 = Livro(123,"fuga1 das galinhas", "Mamia", "2001",10,20.0)
    var livro2 = Livro(124,"fuga2 das galinhas", "Mamia", "2001",10,20.0)
    var livro3 = Livro(125,"fuga3 das galinhas", "Mamia", "2001",10,20.0)
    var livro4 = Livro(126,"fuga4 das galinhas", "Mamia", "2001",10,20.0)

    var colecao = Colecao()
    colecao.cadastrarLivro(livro1, livro2, livro3, livro4)
//    colecao.consultar(123)
    colecao.efetuarVenda(123)
    colecao.efetuarVenda(124)
    colecao.efetuarVenda(125)
    colecao.efetuarVenda(126)

}