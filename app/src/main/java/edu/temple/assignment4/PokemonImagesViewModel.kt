package edu.temple.assignment4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PokemonImagesViewModel : ViewModel() {
        private val pokemon : MutableLiveData<PokemonImageObject> by lazy {
            MutableLiveData<PokemonImageObject>()
        }

        fun getImageObject() : LiveData<PokemonImageObject> {
            return pokemon
        }

        fun setImageObject(imageObject: PokemonImageObject) {
            this.pokemon.value = imageObject
        }
}
