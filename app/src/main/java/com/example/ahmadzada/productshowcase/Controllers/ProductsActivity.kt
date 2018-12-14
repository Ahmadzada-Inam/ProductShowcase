package com.example.ahmadzada.productshowcase.Controllers

import android.content.res.Configuration
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

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize >= 720) {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        this.productsListView.layoutManager = layoutManager
    }
}
