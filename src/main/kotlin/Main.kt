fun main() {
    var livro1 = Livro(123,"fuga1 das galinhas", "Mamia", "2001",10,20.0)
    var livro2 = Livro(124,"fuga2 das galinhas", "Mamia", "2001",10,20.0)
    var livro3 = Livro(125,"fuga3 das galinhas", "Mamia", "2001",10,20.0)
    var livro4 = Livro(126,"fuga4 das galinhas", "Mamia", "2001",10,20.0)

    var pacoteLivro = PacoteLivro(1234,10)
    pacoteLivro.criarPacote(livro1,livro2,livro3,livro4)

    var colecao = Colecao()
    colecao.cadastrarLivro(livro1, livro2, livro3, livro4)
    colecao.cadastrarColeção(pacoteLivro)

    colecao.mostrar(pacoteLivro)

//    pacoteLivro.mostrar()


//    println("Bem Vindo ao Sistema de Estoque!")
//    println("Feito por:")
//    println("Gustavo Boeton")
//    println("Igor Chagas")
//    println()
//    println("O que você deseja fazer?")
//    println("1 - Matricular Livro")
//    println("2 - Matricular Coleção")
//    println("1 - Consultar Livro/Coleção")
//    println("1 - Efetuar Venda")
//
//    var resposta = readLine()





}