package com.pgustavo.dmoviesplus.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pgustavo.dmoviesplus.R
import com.pgustavo.dmoviesplus.model.AllCategory
import com.pgustavo.dmoviesplus.model.CategoryItem

class MainRecyclerAdapter (private val context: Context, private val allCategory: List<AllCategory>):
    RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder>() {

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var categoryTitle: TextView
        var itemRecycler: RecyclerView

        init {
            categoryTitle = itemView.findViewById(R.id.cat_title)
            itemRecycler = itemView.findViewById(R.id.item_recycler)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
       return MainViewHolder(LayoutInflater.from(context)
           .inflate(R.layout.main_recycler_row_item, parent, false))
    }

    override fun getItemCount(): Int {
        return allCategory.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

        holder.categoryTitle.text = allCategory[position].categoryTitle
        setCatItemRecycler(holder.itemRecycler, allCategory[position].categoryItem)
    }

    private fun setCatItemRecycler(recyclerView: RecyclerView, categoryItem: List<CategoryItem>){
        val itemRecyclerAdapter = CategoryItemAdapter(context, categoryItem)
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = itemRecyclerAdapter
    }

}


