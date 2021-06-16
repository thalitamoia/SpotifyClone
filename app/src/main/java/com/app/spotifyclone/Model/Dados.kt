package com.app.spotifyclone.Model

import com.app.spotifyclone.R
import com.google.gson.annotations.SerializedName

data class Categoria(

    @SerializedName("titulo") var titulo: String = "",
    @SerializedName("albuns") var albuns : List<Album> = arrayListOf()

)

data class Album(

        @SerializedName("url_imagem") var album:String = ""
)
data class Categorias(

    @SerializedName("categoria")
    val categorias : List<Categoria>
)

//----------------------------------------

data class Secao(

        var secao: Int,
        var nomeSecao: String

)

 class SecaoBulder{

     var secao:Int = 0
     var nomeSecao:String = ""

     fun build(): Secao = Secao(secao, nomeSecao)

 }

    fun secao(block:SecaoBulder.() -> Unit): Secao = SecaoBulder().apply(block).build()


    fun Dados(): MutableList<Secao> = mutableListOf(

           secao {

                secao = R.drawable.secao1
               nomeSecao = "Podcasts"
           },
            secao {

                secao = R.drawable.secao2
                nomeSecao = "Lançamentos"
            },
            secao {

                secao = R.drawable.secao3
                nomeSecao = "Paradas"
            },
            secao {

                secao = R.drawable.secao4
                nomeSecao = "Shows"
            },
            secao {

                secao = R.drawable.secao1
                nomeSecao = "Artistas"
            },
            secao {

                secao = R.drawable.secao3
                nomeSecao = "Top 10"
            },
            secao {

                secao = R.drawable.secao4
                nomeSecao = "Novidades"
            },
            secao {

                secao = R.drawable.secao2
                nomeSecao = "Talentos"
            }


    )