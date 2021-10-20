package edu.temple.assignment4

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import android.view.*
import androidx.lifecycle.ViewModelProvider

class DisplayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_display, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ViewModelProvider(requireActivity())
            .get(PokemonImagesViewModel::class.java)
            .getImageObject()
            .observe(requireActivity(), {updateImageDetails(it)})
    }

    private fun updateImageDetails(imageObject: PokemonImageObject) {
        view?.findViewById<TextView>(R.id.displayTextView)?.text = imageObject.name.toString()
        view?.findViewById<ImageView>(R.id.displayImageView)?.setImageResource(imageObject.resourceId)
    }

}