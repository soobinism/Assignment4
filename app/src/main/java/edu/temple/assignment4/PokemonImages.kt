package edu.temple.assignment4

import android.content.res.Resources

fun imageList(resources: Resources): ArrayList<PokemonImageObject> {
    return arrayListOf(
        PokemonImageObject(
            id = 1,
            name = "Bulbasaur",
            resourceId = R.drawable.bulbasaur
        ),
        PokemonImageObject(
            id = 2,
            name = "Charmander",
            resourceId = R.drawable.charmander
        ),
        PokemonImageObject(
            id = 3,
            name = "Squirtle",
            resourceId = R.drawable.squirtle
        ),
        PokemonImageObject(
            id = 4,
            name = "Chikorita",
            resourceId = R.drawable.chikorita
        ),
        PokemonImageObject(
            id = 5,
            name = "Cyndaquil",
            resourceId = R.drawable.cyndaquil
        ),
        PokemonImageObject(
            id = 6,
            name = "Totodile",
            resourceId = R.drawable.totodile
        ),
        PokemonImageObject(
            id = 7,
            name = "Treecko",
            resourceId = R.drawable.treecko
        ),
        PokemonImageObject(
            id = 8,
            name = "Torchic",
            resourceId = R.drawable.torchic
        ),
        PokemonImageObject(
            id = 9,
            name = "Mudkip",
            resourceId = R.drawable.mudkip
        ),
        PokemonImageObject(
            id = 10,
            name = "Turtwig",
            resourceId = R.drawable.turtwig
        ),
        PokemonImageObject(
            id = 11,
            name = "Chimchar",
            resourceId = R.drawable.chimchar
        ),
        PokemonImageObject(
            id = 12,
            name = "Piplup",
            resourceId = R.drawable.piplup
        )
    )
}