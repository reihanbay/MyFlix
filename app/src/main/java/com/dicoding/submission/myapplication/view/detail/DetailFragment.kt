package com.dicoding.submission.myapplication.view.detail

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.submission.myapplication.R
import com.dicoding.submission.myapplication.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private var binding : FragmentDetailBinding? = null
    private val bind get() = binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = DetailFragmentArgs.fromBundle(arguments as Bundle).dataFilm

        bind.apply {
            btnBack.setOnClickListener{
                Toast.makeText(requireActivity(), "hallo", Toast.LENGTH_SHORT).show()
                this@DetailFragment.findNavController().navigate(R.id.action_detailFragment_to_homeFragment)
            }
            tvSummary.movementMethod = ScrollingMovementMethod()
            Glide.with(requireActivity()).load(data.img).apply(RequestOptions.placeholderOf(R.drawable.ic_baseline_image).error(R.drawable.ic_baseline_error))
                .into(ivPoster)
            tvTitle.text = data.title
            tvValueGenre.text = data.genre
            tvValueStar.text = data.rate.toString()
            Log.d("TAG", "onViewCreated: ${data.type}")
            when(data.type) {
                "mov" -> tvValueDuration.text = "${data.time.toString()} Hours"
                "tvs" -> tvValueDuration.text = "${data.time.toString()} Seasons"
            }
            tvSummary.text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        }
    }

}