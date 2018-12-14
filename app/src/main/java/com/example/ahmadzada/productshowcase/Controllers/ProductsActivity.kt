package com.example.ahmadzada.productshowcase.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.example.ahmadzada.productshowcase.Adapters.ProductAdapter
import com.example.ahmadzada.productshowcase.Models.Category
import com.example.ahmadzada.productshowcase.R
import com.example.ahmadzada.productshowcase.Services.DataService
import com.example.ahmadzada.productshowcase.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val category = intent.getParcelableExtra<Category>(EXTRA_CATEGORY)

        this.adapter = ProductAdapter(this, DataService.getProducts(category))
        this.productsListView.adapter = this.adapter

        val layoutManager = GridLayoutManager(this, 2)
        this.productsListView.layoutManager = layoutManager
    }
}
