package com.akirachix.blogreadera

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class BlogAdapter (var authorsList:List<BlogReader>):
    RecyclerView.Adapter<AuthorsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.author_blog, parent,false)
        return AuthorsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AuthorsViewHolder, position: Int) {
        val author = authorsList[position]
        holder.tvName.text= author.name
        holder.tvTitle.text=author.title
        holder.tvDate.text = author.toString()
        holder.tvText.text.toString()

      }

    override fun getItemCount(): Int {
        return authorsList.size   }
}


class AuthorsViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
    val tvName = itemView.findViewById<TextView>(R.id.tvName)
    val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    val tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    val tvText = itemView.findViewById<TextView>(R.id.tvText)
}