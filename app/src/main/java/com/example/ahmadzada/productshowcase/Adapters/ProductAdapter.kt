package com.example.ahmadzada.productshowcase.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.ahmadzada.productshowcase.Models.Product
import com.example.ahmadzada.productshowcase.R

class ProductAdapter(val context: Context, val products: List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(this.context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return this.products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(this.products[position], this.context)
    }

    inner class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val productTitle = itemView?.findViewById<TextView>(R.id.product_title)
        val productPrice = itemView?.findViewById<TextView>(R.id.product_price)
        val productImage = itemView?.findViewById<ImageView>(R.id.product_image)

        fun bindProduct(product: Product, context: Context) {
            val resourceId = context.resources.getIdentifier(product.title, "drawable", context.packageName)
            this.productImage?.setImageResource(resourceId)
            this.productTitle?.text = product.title
            this.productPrice?.text = product.price
        }
    }
}