import java.util.*

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
    println("Bem Vindo ao Sistema de Estoque!")
    println("Feito por:")
    println("Gustavo Boeton")
    println("Igor Chagas\n")

    while (true) {
        println("O que você deseja fazer?")
        println("0 - Sair do progama")
        println("1 - Consultar Livro/Coleção")
        println("2 - Efetuar Venda")
        val scan = Scanner(System.`in`)
        val resposta = scan.nextLine().toInt()
        if (resposta == 1) {
            println("Qual o codigo do livro e coleção:")
            val pesquisa = scan.nextLine().toLong()
            if (pesquisa > 999) {
                colecao.consultar(pesquisa, pacoteLivro)
            } else {
                colecao.consultarColec(pesquisa, pacoteLivro)
            }


        } else if (resposta == 2) {
            println("Qual o codigo do livro e a quantidade da compra")
            val pesquisa = scan.nextLine().toLong()
            val quant = scan.nextLine().toInt()
            colecao.efetuarVenda(pesquisa, quant)
        } else if (resposta == 0){
            println("Finalizando progama")
            break
        }
    }
}