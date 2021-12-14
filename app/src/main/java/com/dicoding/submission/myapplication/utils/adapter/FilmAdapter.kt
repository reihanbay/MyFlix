package com.dicoding.submission.myapplication.utils.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.submission.myapplication.R
import com.dicoding.submission.myapplication.databinding.ItemRvFilmBinding
import com.dicoding.submission.myapplication.model.ListFilmModel

class FilmAdapter(private val context: Context, private val type: String, val callback: FragmentCallback) :RecyclerView.Adapter<FilmAdapter.FilmViewHolder>(){
    private val list = ArrayList<ListFilmModel>()

    fun setList(modules: List<ListFilmModel>?) {
        if (modules == null) return
        this.list.clear()
        this.list.addAll(modules)
    }
    inner class FilmViewHolder(val bind: ItemRvFilmBinding) : RecyclerView.ViewHolder(bind.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view = ItemRvFilmBinding.inflate(LayoutInflater.from(context))
        return FilmViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val data =list [position]
        holder.bind.tvTitle.text = data.title
        holder.bind.tvValueStar.text = data.rate.toString()
        holder.bind.tvAuthor.text = context.getString(R.string.author, data.author)
        Glide.with(context).load(data.img).apply(RequestOptions.placeholderOf(R.drawable.ic_baseline_image)
            .error(R.drawable.ic_baseline_error)).into(holder.bind.ivPoster)
        holder.bind.containerRv.setOnClickListener{
            callback.onClick(data)
        }
    }

    override fun getItemCount(): Int = list.size
}
interface FragmentCallback {
    fun onClick(data: ListFilmModel)
}