package edu.temple.assignment4

import android.content.res.Resources

fun imageList(): List<Pokemon>{
    return listOf(
        Pokemon(
            id = 1,
            name = "Bulbasaur",
            resourceId = R.drawable.bulbasaur
        ),
        Pokemon(
            id = 2,
            name = "Charmander",
            resourceId = R.drawable.charmander
        ),
        Pokemon(
            id = 3,
            name = "Squirtle",
            resourceId = R.drawable.squirtle
        ),
        Pokemon(
            id = 4,
            name = "Chikorita",
            resourceId = R.drawable.chikorita
        ),
        Pokemon(
            id = 5,
            name = "Cyndaquil",
            resourceId = R.drawable.cyndaquil
        ),
        Pokemon(
            id = 6,
            name = "Totodile",
            resourceId = R.drawable.totodile
        ),
        Pokemon(
            id = 7,
            name = "Treecko",
            resourceId = R.drawable.treecko
        ),
        Pokemon(
            id = 8,
            name = "Torchic",
            resourceId = R.drawable.torchic
        ),
        Pokemon(
            id = 9,
            name = "Mudkip",
            resourceId = R.drawable.mudkip
        ),
        Pokemon(
            id = 10,
            name = "Turtwig",
            resourceId = R.drawable.turtwig
        ),
        Pokemon(
            id = 11,
            name = "Chimchar",
            resourceId = R.drawable.chimchar
        ),
        Pokemon(
            id = 12,
            name = "Piplup",
            resourceId = R.drawable.piplup
        )
    )
}