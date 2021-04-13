package com.pgustavo.dmoviesplus.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.pgustavo.dmoviesplus.R
import com.pgustavo.dmoviesplus.model.BannerItem
import com.pgustavo.dmoviesplus.model.CategoryItem

class CategoryItemAdapter (private val context: Context, private val categoryItem:List<CategoryItem>)
    : RecyclerView.Adapter<CategoryItemAdapter.CategoryItemViewHolder>() {

    class CategoryItemViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView
        init {
            itemImage = itemView.findViewById(R.id.item_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryItemViewHolder {
        return CategoryItemViewHolder(LayoutInflater.from(context).inflate(R.layout.cat_row_items, parent, false))
    }

    override fun onBindViewHolder(holder: CategoryItemViewHolder, position: Int) {
        holder.itemImage.setImageResource(categoryItem[position].imageUrl)
    }

    override fun getItemCount(): Int {
        return categoryItem.size
    }
}