class Colecao {

    var listaLivro = mutableListOf<Livros>()


    fun cadastrarLivro(livro: Livro) {
        listaLivro.add(livro)
    }



    fun cadastrarLivro(vararg livros: Livro) = livros.forEach { cadastrarLivro(it) }


    fun cadastrarColecao(pacoteLivro: PacoteLivro){
        listaLivro.add(pacoteLivro)
    }

    fun cadastrarColeção(vararg pacoteLivros: PacoteLivro) = pacoteLivros.forEach { cadastrarColecao(it) }

    fun consultar(codigo: Long){
        var i: Int = 0
        var tem: Boolean = false
        var resposta: Livros? = null
        for (lista in listaLivro){
            tem = codigo.equals(listaLivro.get(i).codigo)

            if(tem == true) {
//                resposta = listaLivro.get(i)
                println(listaLivro.get(i).toString())
                break
            }
            i++

        }

        if(tem == false){
            println("Livro não encontrado!")
        }

//        println(resposta.toString())


    }

    fun efetuarVenda(codigo: Long){

        var i: Int = 0
        var tem: Boolean = false
        var resposta: Livros? = null
        for (lista in listaLivro){
            tem = codigo.equals(listaLivro.get(i).codigo)
            resposta = listaLivro.get(i)

            if(tem == true && resposta.quantidade > 0) {
                resposta.venda(1)
                println(resposta.quantidade)
                break
            } else if(tem == true && resposta.quantidade == 0) {
                println("Estoque esgotado")
                break

            }

            i++

        }

        if(tem == false){
            println("Livro não encontrado!")
        }


//        else if (listaLivro.size == 0){
//            println("Estoque esgotado")
//        }
    }



}