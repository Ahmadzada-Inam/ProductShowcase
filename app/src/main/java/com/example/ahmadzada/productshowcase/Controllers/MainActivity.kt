package com.example.ahmadzada.productshowcase.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.ahmadzada.productshowcase.Adapters.CategoryAdapter
import com.example.ahmadzada.productshowcase.R
import com.example.ahmadzada.productshowcase.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.adapter = CategoryAdapter(this, DataService.categories)
        this.categoriesListView.adapter = this.adapter

        val layoutManager = LinearLayoutManager(this)
        this.categoriesListView.layoutManager = layoutManager
        this.categoriesListView.setHasFixedSize(true)
    }
}
