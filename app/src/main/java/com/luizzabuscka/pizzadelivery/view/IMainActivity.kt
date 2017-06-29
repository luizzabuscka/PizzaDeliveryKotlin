package com.luizzabuscka.pizzadelivery.view

import android.widget.ArrayAdapter
import com.luizzabuscka.pizzadelivery.adapters.ProductsAdapter
import com.luizzabuscka.pizzadelivery.entities.Product

/**
 * Created by luizzabuscka on 6/26/17.
 */
interface IMainActivity {

    fun fillList(adapter: ProductsAdapter)
    fun itemClicked(product: Product)
    fun showError(errorCode: Int)

}