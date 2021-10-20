package edu.temple.assignment4

import android.os.Parcel
import android.os.Parcelable

data class PokemonImageObject(val id: Int, val name: String?, val resourceId: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeInt(resourceId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PokemonImageObject> {
        override fun createFromParcel(parcel: Parcel): PokemonImageObject {
            return PokemonImageObject(parcel)
        }

        override fun newArray(size: Int): Array<PokemonImageObject?> {
            return arrayOfNulls(size)
        }
    }
}