package com.example.ahmadzada.productshowcase.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.ahmadzada.productshowcase.Models.Category
import com.example.ahmadzada.productshowcase.R

class CategoryAdapter(val context: Context, val categories: List<Category>) : RecyclerView.Adapter<CategoryAdapter.CategoryHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val view = LayoutInflater.from(this.context).inflate(R.layout.category_list_item, parent, false)
        return CategoryHolder(view)
    }

    override fun getItemCount(): Int {
        return this.categories.count()
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.bindCategory(this.categories[position], this.context)
    }

    inner class CategoryHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)

        fun bindCategory(category: Category, context: Context) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            this.categoryImage?.setImageResource(resourceId)
            this.categoryName?.text = category.title
        }
    }
}