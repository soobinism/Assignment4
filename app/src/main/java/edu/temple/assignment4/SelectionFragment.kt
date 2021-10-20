package edu.temple.assignment4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.fragment.app.Fragment
import androidx.lifecycle.*

private const val ARG_PARAM1 = "param1"

class SelectionFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    lateinit var images: ArrayList<PokemonImageObject>
    lateinit var viewModel: PokemonImagesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        images = arguments?.getParcelableArrayList<PokemonImageObject>(ARG_PARAM1) as ArrayList<PokemonImageObject>
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_selection, container, false)
        recyclerView = layout.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(layout.context, 3)
        viewModel = ViewModelProvider(requireActivity()).get(PokemonImagesViewModel::class.java)
        val adapter = ImageAdapter(imageList(resources)) {
                position -> myOnClick(position)
        }

        recyclerView.adapter = adapter

        return layout
    }

    // Factory method
    companion object {
        fun getInstance (imageList: ArrayList<PokemonImageObject>) : SelectionFragment {
            val fragment = SelectionFragment()
            val bundle = Bundle()

            bundle.putParcelableArrayList(ARG_PARAM1, imageList)
            fragment.arguments = bundle
            return fragment
        }
    }

    private fun myOnClick(position: Int) {
        viewModel.setImageObject(images[position])
    }
}