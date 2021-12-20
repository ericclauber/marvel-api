package com.eric.marvelapi.comics.ui.adapter

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.eric.core.extensions.toBRValue
import com.eric.marvelapi.R
import com.eric.marvelapi.comics.model.ComicModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.comic_item.view.*

class ComicsViewHolder (internal val context: Context, itemView: View) :
    RecyclerView.ViewHolder(itemView) {

        fun bindItem(item: ComicModel) {

            Picasso.get()
                .load(item.thumbnail?.path)
                .placeholder(R.drawable.load_image)
                .error(R.drawable.load_image_error)
                .into(itemView.imageViewThumbnail)

            itemView.textViewTitle.text = item.title
            itemView.textViewPrice.text = item.price?.price?.toBRValue()
        }
    }