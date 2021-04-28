package com.pgustavo.dmoviesplus.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.pgustavo.dmoviesplus.R
import com.pgustavo.dmoviesplus.model.BannerItem


class BannerItemAdapter(private val context: Context, private val BannerItem: List<BannerItem>)
    : RecyclerView.Adapter<BannerItemAdapter.BannerItemViewHolder>() {


    class BannerItemViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {



        var itemImage: ImageView
        init {

            itemImage = itemView.findViewById(R.id.ban_item_image)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerItemViewHolder {
        return BannerItemViewHolder(LayoutInflater.from(context).inflate(R.layout.ban_row_item, parent, false))
    }

    override fun onBindViewHolder(holder: BannerItemViewHolder, position: Int) {
        holder.itemImage.setImageResource(BannerItem[position].imageUrl)


    }

    override fun getItemCount(): Int {
        return BannerItem.size
    }


}