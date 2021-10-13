package edu.temple.assignment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.display_activity)

        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val position = intent.getIntExtra(EXTRA_POSITION, 0)
        val pokeArray = resources.getStringArray(R.array.pokemon_array)

        nameTextView.text = pokeArray[position]
        imageView.setImageResource(imageList()[position].resourceId)
    }

    //Test
}