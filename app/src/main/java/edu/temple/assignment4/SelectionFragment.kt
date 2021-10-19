package edu.temple.assignment4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager

const val EXTRA_POSITION = "edu.temple.assignment4.POSITION"

class SelectionFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = GridLayoutManager(this, 3)

        val adapter = ImageAdapter(imageList()) {
                position -> myOnClick(position)
        }

        recyclerView.adapter = adapter
    }

    private fun myOnClick(position: Int) {
        val intent = Intent(this, DisplayFragment::class.java).apply {
            putExtra(EXTRA_POSITION, position)
        }
        startActivity(intent)
    }
}