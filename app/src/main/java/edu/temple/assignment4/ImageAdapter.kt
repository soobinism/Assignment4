package edu.temple.assignment4

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.temple.assignment4.ImageAdapter.ViewHolder

class ImageAdapter (private val dataSet: List<Pokemon>, activity: Activity) : RecyclerView.Adapter<ViewHolder>()
{
    var imageView: ImageView = activity.findViewById(R.id.imageView) //check this
    var textView: TextView = activity.findViewById(R.id.textView)   // Pokemon name


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView : ImageView = itemView.findViewById(R.id.imageViewLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(dataSet[position].resourceId)

        holder.imageView.setOnClickListener{
            imageView.setImageResource(dataSet[position].resourceId)
            textView.text = dataSet[position].name
        }
    }

    override fun getItemCount() = 12
}