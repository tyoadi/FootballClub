package com.example.egov.footballclub

import android.content.Context
import android.support.v7.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import android.view.*
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_list.view.*

class RecyclerViewAdapter(private val context: Context, private val items: List<Item>, private val listener:
    (Item) -> Unit) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position], listener)

    }

    override fun getItemCount(): Int = items.size


    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder
        (containerView), LayoutContainer {


        fun bindItem(items: Item, listener: (Item) -> Unit) {

            itemView.name.text = items.name
            items.image?.let { Picasso.get().load(it).into(itemView.image) }
            itemView.setOnClickListener { listener(items) }

        }

    }
}

