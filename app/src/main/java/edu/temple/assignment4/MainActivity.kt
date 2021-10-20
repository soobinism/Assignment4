package edu.temple.assignment4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val selectionFragment = SelectionFragment.getInstance(imageList(resources))

        //Fragment transactions
        if (savedInstanceState == null)
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentSelectionContainerView, selectionFragment)
                .commit()

        val displayFragment = DisplayFragment()

        if (savedInstanceState == null)
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentDisplayContainerView, displayFragment)
                .commit()
    }

}