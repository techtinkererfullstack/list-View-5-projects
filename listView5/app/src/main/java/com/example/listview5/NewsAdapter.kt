package com.example.listview5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listview5.databinding.ItemsListBinding

/* Concepts
 1. custom adapter inherit recycler adapter<Data Type this case it is a view holder>()
 2. our view holder will inherit recycler view view holder - (what will it view our items list)
    meaning Initializing View holder
 3. Override Create methods


 */


class NewsAdapter(private val newsList: List<News>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    inner class NewsViewHolder(val binding: ItemsListBinding) :
        RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NewsViewHolder {
        val binding = ItemsListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewsViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: NewsViewHolder,
        position: Int
    ) {
        val news = newsList[position]
        holder.binding.newsHeadlineTV.text = news.title
        holder.binding.newsDescriptionTV.text = news.description
        holder.binding.newsImgV.setImageResource(news.newsImg)
    }

    override fun getItemCount(): Int = newsList.size


}