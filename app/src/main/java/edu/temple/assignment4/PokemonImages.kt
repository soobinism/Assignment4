package edu.temple.assignment4

import android.content.res.Resources

fun imageList(): List<Pokemon>{
    return listOf(
        Pokemon(
            id = 1,
            name = "Bulbasaur",
            description = "There is a plant seed on its back right from the day this Pokémon is born. The seed slowly grows larger.",
            resourceId = R.drawable.bulbasaur
        ),
        Pokemon(
            id = 2,
            name = "Charmander",
            description = "It has a preference for hot things. When it rains, steam is said to spout from the tip of its tail.",
            resourceId = R.drawable.charmander
        ),
        Pokemon(
            id = 3,
            name = "Squirtle",
            description = "When it retracts its long neck into its shell, it squirts out water with vigorous force.",
            resourceId = R.drawable.squirtle
        ),
        Pokemon(
            id = 4,
            name = "Chikorita",
            description = "In battle, Chikorita waves its leaf around to keep the foe at bay. However, a sweet fragrance also wafts from the leaf, becalming the battling Pokémon and creating a cozy, friendly atmosphere all around.",
            resourceId = R.drawable.chikorita
        ),
        Pokemon(
            id = 5,
            name = "Cyndaquil",
            description = "Cyndaquil protects itself by flaring up the flames on its back. The flames are vigorous if the Pokémon is angry. However, if it is tired, the flames splutter fitfully with incomplete combustion.",
            resourceId = R.drawable.cyndaquil
        ),
        Pokemon(
            id = 6,
            name = "Totodile",
            description = "Despite the smallness of its body, Totodile’s jaws are very powerful. While the Pokémon may think it is just playfully nipping, its bite has enough power to cause serious injury.",
            resourceId = R.drawable.totodile
        ),
        Pokemon(
            id = 7,
            name = "Treecko",
            description = "Treecko has small hooks on the bottom of its feet that enable it to scale vertical walls. This Pokémon attacks by slamming foes with its thick tail.",
            resourceId = R.drawable.treecko
        ),
        Pokemon(
            id = 8,
            name = "Torchic",
            description = "Torchic sticks with its Trainer, following behind with unsteady steps. This Pokémon breathes fire of over 1,800 degrees Fahrenheit, including fireballs that leave the foe scorched black.",
            resourceId = R.drawable.torchic
        ),
        Pokemon(
            id = 9,
            name = "Mudkip",
            description = "The fin on Mudkip’s head acts as highly sensitive radar. Using this fin to sense movements of water and air, this Pokémon can determine what is taking place around it without using its eyes.",
            resourceId = R.drawable.mudkip
        ),
        Pokemon(
            id = 10,
            name = "Turtwig",
            description = "Photosynthesis occurs across its body under the sun. The shell on its back is actually hardened soil.",
            resourceId = R.drawable.turtwig
        ),
        Pokemon(
            id = 11,
            name = "Chimchar",
            description = "Its fiery rear end is fueled by gas made in its belly. Even rain can’t extinguish the fire.",
            resourceId = R.drawable.chimchar
        ),
        Pokemon(
            id = 12,
            name = "Piplup",
            description = "It doesn’t like to be taken care of. It’s difficult to bond with since it won’t listen to its Trainer.",
            resourceId = R.drawable.piplup
        )
    )
}