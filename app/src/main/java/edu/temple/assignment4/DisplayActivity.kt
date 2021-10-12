package edu.temple.assignment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.display_activity)

        val textView = findViewById<TextView>(R.id.textView)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val descriptionTextView = findViewById<TextView>(R.id.descriptionTextView)
        val position = intent.getIntExtra(EXTRA_POSITION, 0)

        textView.text = imageList()[position].name
        descriptionTextView.text = imageList()[position].description
        imageView.setImageResource(imageList()[position].resourceId)
    }

    //Test
}