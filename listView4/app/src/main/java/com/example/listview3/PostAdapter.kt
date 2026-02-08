package com.example.listview3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listview3.databinding.ListItemBinding

class PostAdapter(private val postList: List<Post>): RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    inner class PostViewHolder(val binding: ListItemBinding ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PostViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: PostViewHolder,
        position: Int
    ) {
        val post = postList[position]
        holder.binding.thumbnailTitleTV.text = post.postBy
        holder.binding.postInformation.text = post.postDescription
        holder.binding.thumbnailTV.setImageResource(post.postImage)

    }

    override fun getItemCount(): Int = postList.size



}