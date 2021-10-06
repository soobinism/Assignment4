package edu.temple.assignment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mRecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = ImageAdapter(imageList(), this)
        mRecyclerView.adapter = adapter
        mRecyclerView.layoutManager = GridLayoutManager(this, 3)
    }
}