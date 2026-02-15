package com.example.recyclerview2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview2.databinding.ItemListBinding

class ProfileAdapter(private val profileList: List<Profile>) :
    RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>() {

    class ProfileViewHolder(val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): ProfileViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProfileViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ProfileViewHolder, position: Int
    ) {
        val profileList = profileList[position]
        holder.binding.nameTV.text = profileList.name
        holder.binding.designation.text = profileList.designation
        holder.binding.profileImg.setImageResource(R.drawable.person)
    }

    override fun getItemCount(): Int = profileList.size


}