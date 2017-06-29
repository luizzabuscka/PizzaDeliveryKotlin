package com.luizzabuscka.pizzadelivery.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import com.luizzabuscka.pizzadelivery.entities.Product
import kotlinx.android.synthetic.main.item_product.view.*


/**
 * Created by luizzabuscka on 6/28/17.
 */
class ProductsAdapter(val items: Array<Product>,
                      val layout: Int,
                      val listener: (Product) -> Unit) : RecyclerView.Adapter<ProductsAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bindItem(items[position], listener)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return ViewHolder(v)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(item: Product, listener: (Product) -> Unit) = with(itemView) {
            itemView.tvName.text = item.name
            itemView.tvPrice.text = item.value.toString()
            setOnClickListener {
                listener(item)
            }
        }

    }
}