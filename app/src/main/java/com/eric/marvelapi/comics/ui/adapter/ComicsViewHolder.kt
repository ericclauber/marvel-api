package com.eric.marvelapi.comics.ui.adapter

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.eric.marvelapi.comics.model.Comic

class ComicsViewHolder (internal val context: Context, itemView: View) :
    RecyclerView.ViewHolder(itemView) {

        fun bindItem(item: Comic) {

//            Picasso.with(context)
//                .load(item.thumbnail.path)
//                .placeholder(R.drawable.load_image)
//                .error(R.drawable.load_image_error)
//                .into(itemView.imageViewThumbnail)

//            itemView.textViewTitle.text = item.title
//            itemView.textViewPrice.text = item.prices[0].price.toBRValue()
        }
    }