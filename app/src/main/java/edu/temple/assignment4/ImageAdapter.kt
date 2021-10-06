package edu.temple.assignment4

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.temple.assignment4.ImageAdapter.ViewHolder

class ImageAdapter (private val dataSet: List<Pokemon>, private val myOnClick: (position: Int) -> Unit) : RecyclerView.Adapter<ViewHolder>()
{
    class ViewHolder(_imageView: View, private val myOnClick: (position: Int) -> Unit) : RecyclerView.ViewHolder(_imageView), View.OnClickListener {

        val imageView: ImageView = _imageView.findViewById(R.id.imageViewLayout)

        init {
            imageView.setOnClickListener(this)
        }
        // Send position of click back to myOnClick.
        override fun onClick(v: View?) {
            val position = adapterPosition
            myOnClick(position)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_layout, parent, false)
        return ViewHolder(view, myOnClick)
    }

    override fun getItemCount() = 12

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(dataSet[position].resourceId)
    }
}