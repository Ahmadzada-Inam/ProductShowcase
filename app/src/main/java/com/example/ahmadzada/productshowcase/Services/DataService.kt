package com.example.ahmadzada.productshowcase.Services

import com.example.ahmadzada.productshowcase.Models.Category
import com.example.ahmadzada.productshowcase.Models.Product

object DataService {

    val categories = listOf(
            Category("HOODIES", "hoodieimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("HOODIES", "hoodieimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("HOODIES", "hoodieimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hoodies = listOf(
            Product("hoodie1", "$15", "Hoodie 1"),
            Product("hoodie2", "$18", "Hoodie 2"),
            Product("hoodie3", "$16", "Hoodie 3"),
            Product("hoodie4", "$19", "Hoodie 4"),
            Product("hoodie1", "$15", "Hoodie 1"),
            Product("hoodie2", "$18", "Hoodie 2"),
            Product("hoodie3", "$16", "Hoodie 3"),
            Product("hoodie4", "$19", "Hoodie 4"),
            Product("hoodie1", "$15", "Hoodie 1"),
            Product("hoodie2", "$18", "Hoodie 2"),
            Product("hoodie3", "$16", "Hoodie 3"),
            Product("hoodie4", "$19", "Hoodie 4")
    )

    val shirts = listOf(
            Product("shirt1", "$15", "Shirt 1"),
            Product("shirt2", "$18", "Shirt 2"),
            Product("shirt3", "$16", "Shirt 3"),
            Product("shirt4", "$19", "Shirt 4"),
            Product("shirt5", "$21", "Shirt 5"),
            Product("shirt1", "$15", "Shirt 1"),
            Product("shirt2", "$18", "Shirt 2"),
            Product("shirt3", "$16", "Shirt 3"),
            Product("shirt4", "$19", "Shirt 4"),
            Product("shirt5", "$21", "Shirt 5"),
            Product("shirt1", "$15", "Shirt 1"),
            Product("shirt2", "$18", "Shirt 2"),
            Product("shirt3", "$16", "Shirt 3"),
            Product("shirt4", "$19", "Shirt 4"),
            Product("shirt5", "$21", "Shirt 5")
    )

    val hats = listOf(
            Product("hat1", "$15", "Hat 1"),
            Product("hat2", "$18", "Hat 2"),
            Product("hat3", "$16", "Hat 3"),
            Product("hat4", "$19", "Hat 4"),
            Product("hat1", "$15", "Hat 1"),
            Product("hat2", "$18", "Hat 2"),
            Product("hat3", "$16", "Hat 3"),
            Product("hat4", "$19", "Hat 4"),
            Product("hat1", "$15", "Hat 1"),
            Product("hat2", "$18", "Hat 2"),
            Product("hat3", "$16", "Hat 3"),
            Product("hat4", "$19", "Hat 4")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: Category) : List<Product> {
        return when (category.title) {
            "HOODIES" -> hoodies
            "SHIRTS" -> shirts
            "HATS" -> hats
            else -> digitalGoods
        }
    }
}